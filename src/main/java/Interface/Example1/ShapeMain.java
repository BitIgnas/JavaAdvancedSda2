package Interface.Example1;

public class ShapeMain {
    public static void main(String[] args) {

        Circle circle = new Circle(9);
        circle.getArea();
        circle.getPerimeter();

        Triangle triangle = new Triangle(5, 8);
        triangle.getArea();
        triangle.getPerimeter();
        triangle.print();

    }
}
