package sub4;

sealed class Shape permits Circle, Rectangle, Triangle {

    protected double area;

    public double getArea() {
        return area;
    }
}

final class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        this.area = Math.PI * radius * radius;
    }
}

final class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        this.area = width * height;
    }
}

final class Triangle extends Shape{
    private double base;
    private double height;
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
        this.area = base*height;
    }
}

public class Ex4_SealedTest {

    public static void main(String[] args) {
         Shape[] shapes = {
                 new Circle(5),
                 new Rectangle(2,3),
                 new Triangle(4,5)
         };

         for (Shape shape : shapes) {

             String shapeName = shape.getClass().getSimpleName();

             System.out.println(shapeName + " 넓이: " + shape.getArea());
         }
    }
}
