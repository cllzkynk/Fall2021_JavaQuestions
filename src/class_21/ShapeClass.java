package class_21;

public class ShapeClass {

    /**
     * Write program:
     * Shape class has a constructor that takes the
     * radius and has a subclass as  circle class.
     * In circle class create a method to calculate the area of circle.
     * Test your code
     */

    double radius;
    ShapeClass(double radius) {
        this.radius = radius;
    }
}



class Circle extends ShapeClass {
    Circle(double radius) {
        super(radius);
    }

    void CalculateArea() {
        double area;
        double pie = 3.14;
        area = pie * radius * radius;
        System.out.println("Radius is: " + area);
    }

    public static void main(String[] args) {
        Circle Circle = new Circle(2);
        Circle.CalculateArea();
    }

}