abstract class Shape {
   
    protected int dimension1;
    protected int dimension2;

    public Shape(int dimension1, int dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

   
    public abstract void printArea();
}
class Rectangle extends Shape {

    public Rectangle(int length, int width) {
        super(length, width);
    }


    public void printArea() {
        int area = dimension1 * dimension2;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle extends Shape {

    public Triangle(int base, int height) {
        super(base, height);
    }

   
    public void printArea() {
        double area = 0.5 * dimension1 * dimension2;
        System.out.println("Area of Triangle: " + area);
    }
}

class Circle extends Shape {
   
    public Circle(int radius) {
        super(radius, 0);
    }

   
    public void printArea() {
        double area = Math.PI * dimension1 * dimension1;
        System.out.println("Area of Circle: " + area);
    }
}


public class Rect{
    public static void main(String[] args) {
       
        Rectangle rectangle = new Rectangle(5, 10);
        Triangle triangle = new Triangle(4, 8);
        Circle circle = new Circle(6);

        rectangle.printArea();
        triangle.printArea();
        circle.printArea();
    }
}
