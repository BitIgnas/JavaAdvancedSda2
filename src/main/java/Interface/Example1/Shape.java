package Interface.Example1;

//contract
public interface Shape {

    ShapeFormat format = ShapeFormat.TWO_DIMENTIONAL;

    void getArea();
    void getPerimeter();
    String getFormat();

    default void print(){
        System.out.println("Shape " + this);
    }



}
