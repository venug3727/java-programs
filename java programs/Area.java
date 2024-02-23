import java.util.Scanner;

abstract class Shape {
    int length;
    int width;

    abstract void area(double length, double width);

}

class Rectangle extends Shape {
    void area(double length, double width) {

        System.out.println("Area of the Rectangle is:" + (length * width));
    }
}

class Triangle extends Shape {
    void area(double length, double width) {
        System.out.println("The area of the triangle is:" + (0.5 * length * width));
    }
}

class Circal extends Shape {
    void area(double length, double width) {
        System.out.println("Area of the circal is : " + (3.14 * length * width));
    }
}

public class Area {
    public static void main(String[] args) {
        Rectangle re = new Rectangle();
        Triangle tr = new Triangle();
        Circal cr = new Circal();
        re.area(23.3, 12.4);
        cr.area(34, 35);
        tr.area(12, 13);
    }

}