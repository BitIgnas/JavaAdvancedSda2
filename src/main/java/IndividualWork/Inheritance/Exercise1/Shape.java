package IndividualWork.Inheritance.Exercise1;

public class Shape {
    private String name;
    private double perimeter;
    private double area;
    private boolean isShape;

    public Shape(String name, double perimeter, double area, boolean isShape) {
        this.name = name;
        this.perimeter = perimeter;
        this.area = area;
        this.isShape = isShape;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public boolean isShape() {
        return isShape;
    }

    public void setShape(boolean shape) {
        isShape = shape;
    }
}
