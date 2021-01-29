package Inheritance.Example1.Example3;

import java.util.ArrayList;
import java.util.List;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();
        car.startCar();

        //audi is-a Car
        Audi audi = new Audi();
        audi.startCar();

        //volvo is-a Car
        Volvo volvo = new Volvo();
        volvo.startCar();

        //polymorphism - many forms
        //can have more forms
        //example: audi and volvo
        Car audiCar = new Audi(); // works as audi
        audiCar.startCar();

        Car volvoCar = new Volvo();


        List<Audi> cars = new ArrayList<>();
        cars.add(audi);

        List<Car> manyCars = new ArrayList<>();
        manyCars.add(audiCar);
        manyCars.add(volvoCar);


       Car newCar = new Car();

       newCar = new Audi();
       //newCar.setBrand("Zigul")



    }
}
