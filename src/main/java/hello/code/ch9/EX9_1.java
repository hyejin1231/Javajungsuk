package hello.code.ch9;

public class EX9_1 {

    public static void main(String[] args) {
        Value value1 = new Value(10);
        Value value2 = new Value(10);

        if (value1.equals(value2)) {
            System.out.println("v1과 v2는 같습니다.");
        }else {
            System.out.println("v1과 v2는 다릅니다.");
        }
    }
}

class Value {
    int value;

    public Value(int value) {
        this.value = value;
    }
}
