package Abstraction.Example1;

public class SportCar extends Vehicle{


    public SportCar(int maxSpeed) {
        super(maxSpeed);
        System.out.println("Specific sportCar constructor logic");
        additionalLogic();
    }

    @Override
    public void move() {
        System.out.println("Moving like sport car...VRUM....");
    }

    private void additionalLogic(){
        System.out.println("Additional logic.");
    }
}
