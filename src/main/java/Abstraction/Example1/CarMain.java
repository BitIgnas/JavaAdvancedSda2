package Abstraction.Example1;

import java.util.ArrayList;
import java.util.List;

public class CarMain {
    public static void main(String[] args) {
       // Vehicle vehicle = new Vehicle(); Abstrack class help we cant create object

        Vehicle vehicle = new Vehicle(12) {
            @Override
            public void move() {
                System.out.println("Annonymus inner vehicle implementation");
            }
        };

        vehicle.move();


        Car car = new Car(150);
        car.move();

        SportCar sportCar = new SportCar(180);
        sportCar.move();

        Vehicle bmw = new Car(100);
        bmw.move();
        Vehicle audi = new SportCar(120);
        audi.move();

        List<Vehicle> cars = new ArrayList<>();



    }
}
