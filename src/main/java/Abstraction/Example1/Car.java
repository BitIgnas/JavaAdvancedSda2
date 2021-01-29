package Abstraction.Example1;

public class Car extends Vehicle {

    public Car(int maxSpeed) {
        super(maxSpeed);
    }

    //Implemented contract
    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}
