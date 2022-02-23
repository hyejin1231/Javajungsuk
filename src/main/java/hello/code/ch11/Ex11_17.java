package hello.code.ch11;

import java.util.*;

public class Ex11_17 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("김자바", 90);
        map.put("김자바", 100);
        map.put("이자바", 100);
        map.put("강자바", 80);
        map.put("안자바", 90);

        Set set = map.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry e = (Map.Entry) iterator.next();
            System.out.println("이름 : " + e.getKey() + ", 점수 : " + e.getValue());
        }

        set = map.keySet();
        System.out.println("참가자 명단 " + set);

        Collection values = map.values();
        Iterator iterator1 = values.iterator();

        int total = 0;
        while (iterator1.hasNext()) {
            int i = (int) iterator1.next();
            total += i;
        }

        System.out.println("총점 : " + total);
        System.out.println("평균 : " + (float) total / set.size());
        System.out.println("최고 점수 : " + Collections.max(values));
        System.out.println("최저 점수 : " + Collections.min(values));
    }
}
