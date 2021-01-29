package IndividualWork.Inheritance.Exercise1;

public class Rectangle extends Shape{

    private double width;
    private double height;


    public Rectangle(String name, double perimeter, double area, boolean isShape, double width, double height) {
        super(name, perimeter, area, isShape);
        this.width = width;
        this.height = height;

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
