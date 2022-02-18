package hello.code.ch7;

import java.util.Arrays;

public class Ex7_4 {
    public static void main(String[] args) {
        Point3D p = new Point3D(1, 2, 3);
        System.out.println("p = " + p);
    }
}

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Point3D extends Point {
    int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
