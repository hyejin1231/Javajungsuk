
package hello.code.ch9;

public class Ex9_8 {

    public static void main(String[] args) {
        char[] cArr = new char[0];
        String s = new String(cArr);

        System.out.println("char.length = " + cArr.length);
        System.out.println("@@@" + s + "@@@");
    }
}
