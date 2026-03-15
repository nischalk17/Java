interface IShape {
    double getArea();
}
class Rectangle implements IShape {
    double length, breadth;
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public double getArea() {
        return length * breadth;
    }
}
class Circle implements IShape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return 3.14 * radius * radius;
    }
}
class Triangle implements IShape {
    double base, height;
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public double getArea() {
        return 0.5 * base * height;
    }
}
public class Lab3 {
    public static void main(String[] args) {
        IShape rect = new Rectangle(8, 4);
        IShape circle = new Circle(6);
        IShape triangle = new Triangle(7, 3);

        System.out.println("Area of Rectangle: " + rect.getArea());
        System.out.println("Area of Circle: " + circle.getArea());
        System.out.println("Area of Triangle: " + triangle.getArea());
    }
}
