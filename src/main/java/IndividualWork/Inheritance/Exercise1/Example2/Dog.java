package IndividualWork.Inheritance.Exercise1.Example2;

public class Dog extends Animal{


    private String breed;
    private boolean isFriendly;

    public Dog(String gender, int age, String breed, boolean isFriendly) {
        super(gender, age);
        this.breed = breed;
        this.isFriendly = isFriendly;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isFriendly() {
        return isFriendly;
    }

    public void setFriendly(boolean friendly) {
        isFriendly = friendly;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", isFriendly=" + isFriendly +
                '}';
    }
}
