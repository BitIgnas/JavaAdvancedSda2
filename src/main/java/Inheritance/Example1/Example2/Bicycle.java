package Inheritance.Example1.Example2;

public class Bicycle {

    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public int gear;
    public int speed;

    public Bicycle() {

    }


    public void commonBicycleBehavior() {
        System.out.println("Behaving like BICYCKE");

    }

    public void applyBreak(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "gear=" + gear +
                ", speed=" + speed +
                '}';
    }
}

