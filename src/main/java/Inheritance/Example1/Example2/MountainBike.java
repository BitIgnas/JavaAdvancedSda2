package Inheritance.Example1.Example2;

//IS-A MountainBike IS-A Bicycle
public class MountainBike extends  Bicycle  {

    //MountainBike specific attribute
    public int seaHeight;

    public MountainBike(int gear, int speed, int seaHeight) {
        super(gear, speed);
        this.seaHeight = seaHeight;
    }

    public MountainBike(){

    }

    @Override
    public void commonBicycleBehavior() {
       // super.commonBicycleBehavior(); tevines klasese legesys
        System.out.println("Driving like mountain bike");
    }

    @Override
    public String toString() {
        return "MountainBike{" +
                "seaHeight=" + seaHeight +
                ", gear=" + gear +
                ", speed=" + speed +
                '}';
    }
}
