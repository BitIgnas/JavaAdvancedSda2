package IndividualWork.Inheritance.Exercise1;

public class Circle extends Shape{

    private double radius;
    private double circumference;
    public Circle(String name, double perimeter, double area, boolean isShape, double radius, double circumference) {
        super(name, perimeter, area, isShape);
        this.radius = radius;
        this.circumference = circumference;


    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        return circumference;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }
}
