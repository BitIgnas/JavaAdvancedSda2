package Interface.Example1;

public class Circle implements Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void getArea() {
        double area = Math.PI * Math.pow(radius, radius);
        System.out.println("Circle area is - " + area);
    }

    @Override
    public void getPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter - " + perimeter);


    }

    @Override
    public String getFormat() {
      return Shape.format.toString();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
