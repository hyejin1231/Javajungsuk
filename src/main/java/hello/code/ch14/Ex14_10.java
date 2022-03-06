package hello.code.ch14;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

class Student2 {
    String name;
    boolean isMale;
    int hak;
    int ban;
    int score;

    public Student2(String name, boolean isMale, int hak, int ban, int score) {
        this.name = name;
        this.isMale = isMale;
        this.hak = hak;
        this.ban = ban;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public boolean isMale() {
        return isMale;
    }

    public int getHak() {
        return hak;
    }

    public int getBan() {
        return ban;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", isMale=" + isMale +
                ", hak=" + hak +
                ", ban=" + ban +
                ", score=" + score +
                '}';
    }

    enum Level {HIGH, MID, LOW};
}

public class Ex14_10 {
    public static void main(String[] args) {
        Student2[] stuArr = {
                new Student2("나자바", true, 1, 1, 300),
                new Student2("김지미", false, 1, 1, 250),
                new Student2("김자바", true, 1, 1, 200),
                new Student2("이지미", false, 1, 2, 150),
                new Student2("남자바", true, 1, 2, 100),
                new Student2("안지미", false, 1, 2, 50),
                new Student2("황지미", false, 1, 3, 100),
                new Student2("강지미", false, 1, 3, 150),
                new Student2("이자바", true, 1, 3, 200),
                new Student2("나자바", true, 2, 1, 300),
                new Student2("김지미", false, 2, 1, 250),
                new Student2("김자바", true, 2, 1, 100),
                new Student2("이지미", false, 2, 2, 150),
                new Student2("남자바", true, 2, 2, 100),
                new Student2("안지미", false, 2, 2, 50),
                new Student2("황지미", false, 2, 3, 100),
                new Student2("강지미", false, 2, 3, 150),
                new Student2("이자바", true, 2, 3, 200)
        };

        System.out.println("1. 단순분할(성별로 분할)");

        Map<Boolean, List<Student2>> stuBySex = Stream.of(stuArr).collect(partitioningBy(Student2::isMale));

        List<Student2> malStudent = stuBySex.get(true);
        List<Student2> femalStudent = stuBySex.get(false);

        for (Student2 student2 : malStudent) {
            System.out.println(student2);
        }
        System.out.println();
        for (Student2 student2 : femalStudent) {
            System.out.println(student2);
        }

        System.out.println("2. 단순분할 + 통계(성별학생수)");
        Map<Boolean, Long> stuNumBySex = Stream.of(stuArr).collect(partitioningBy(Student2::isMale, counting()));

        System.out.println("남학생 수 : " + stuNumBySex.get(true));
        System.out.println("여학생 수 : " + stuNumBySex.get(false));

        System.out.println("3. 단순분할  + 통계(성별1등)");
        Map<Boolean, Optional<Student2>> topScoreBySex = Stream.of(stuArr).collect(partitioningBy(Student2::isMale, maxBy(Comparator.comparingInt(Student2::getScore))));

        System.out.println("남학생 1등 : " + topScoreBySex.get(true));
        System.out.println("여학생 1등 : " + topScoreBySex.get(false));

        Map<Boolean, Student2> topScoreBySex2 = Stream.of(stuArr).collect(partitioningBy(Student2::isMale, collectingAndThen(maxBy(Comparator.comparingInt(Student2::getScore)), Optional::get)));
        System.out.println("남학생 1등 : " + topScoreBySex2.get(true));
        System.out.println("여학생 1등 : " + topScoreBySex2.get(false));

        System.out.println("4. 다중분할 (성별 불합격자, 100점 이하");
        Map<Boolean, Map<Boolean, List<Student2>>> failedStuBySex = Stream.of(stuArr).collect(partitioningBy(Student2::isMale, partitioningBy(s -> s.getScore() <= 100)));

        List<Student2> failedMalStu = failedStuBySex.get(true).get(true);
        List<Student2> failedFemailStu = failedStuBySex.get(false).get(true);

        for (Student2 student2 : failedMalStu) {
            System.out.println(student2);
        }
        System.out.println();

        for (Student2 student2 : failedFemailStu) {
            System.out.println(student2);
        }


    }
}
