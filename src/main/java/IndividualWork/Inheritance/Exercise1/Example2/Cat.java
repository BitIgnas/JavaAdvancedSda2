package IndividualWork.Inheritance.Exercise1.Example2;

public class Cat extends Animal{

    private String breed;
    private int numberOfLives;
    private String size;

    public Cat(String gender, int age, String breed, int numberOfLives, String size){
        super(gender, age);
        this.breed = breed;
        this.numberOfLives = numberOfLives;
        this.size = size;

    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                ", numberOfLives=" + numberOfLives +
                ", size='" + size + '\'' +
                '}';
    }
}
