package hello.code.ch11;

import java.util.HashSet;
import java.util.Iterator;

public class Ex11_12 {
    public static void main(String[] args) {
        HashSet setA = new HashSet();
        HashSet setB = new HashSet();
        HashSet setHab = new HashSet();
        HashSet setKyo = new HashSet();
        HashSet setCha = new HashSet();

        setA.add("1");
        setA.add("2");
        setA.add("3");
        setA.add("4");
        setA.add("5");

        System.out.println("A = " + setA);

        setB.add("4");
        setB.add("5");
        setB.add("6");
        setB.add("7");
        setB.add("8");

        System.out.println("B = " + setB);

        Iterator iterator = setB.iterator();
        while (iterator.hasNext()) {
            Object tmp = iterator.next();
            if (setA.contains(tmp)) {
                setKyo.add(tmp);
            }
        }

        Iterator iterator1 = setA.iterator();
        while (iterator1.hasNext()) {
            Object tmp = iterator1.next();
            if (!setB.contains(tmp)) {
                setCha.add(tmp);
            }
        }

        Iterator iterator2 = setA.iterator();
        while (iterator2.hasNext()) {
            Object tmp = iterator2.next();
            setHab.add(tmp);
        }

        Iterator iterator3 = setB.iterator();
        while (iterator3.hasNext()) {
            Object tmp = iterator3.next();
            setHab.add(tmp);
        }

        System.out.println("A ∪ B = " + setHab);
        System.out.println("A ∩ B = " + setKyo);
        System.out.println("A - B = " + setCha);

    }
}
