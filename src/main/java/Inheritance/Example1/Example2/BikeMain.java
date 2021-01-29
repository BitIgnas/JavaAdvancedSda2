package Inheritance.Example1.Example2;

public class BikeMain {
    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle(); //Has ONLY Bicycle functionality
        System.out.println(bicycle);

        Bicycle anotherBicycle = new Bicycle(5, 8);
        System.out.println(anotherBicycle);

        MountainBike mountainBike = new MountainBike(); //Has Bicycle + MountainBike functionality
        System.out.println(mountainBike);
        MountainBike anotherMB = new MountainBike(1, 2, 3);

        System.out.println(anotherMB);


        boolean ifBicycleIsABicycle = bicycle instanceof Bicycle;
        System.out.println(ifBicycleIsABicycle);

        boolean isMountainBikeABicycle = mountainBike instanceof Bicycle;
        System.out.println(isMountainBikeABicycle);

        boolean isMountainBikeBike = mountainBike instanceof MountainBike;
        System.out.println(isMountainBikeBike);
    }
}
