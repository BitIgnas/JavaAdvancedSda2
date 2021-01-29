package IndividualWork.Inheritance.Exercise1.Example2;

import java.util.ArrayList;
import java.util.List;

public class AnimalMain {
    public static void main(String[] args) {
        //String gender, int age, String breed, int numberOfLives, String size
        Animal animal = new Animal("male", 4);

        Cat cat = new Cat("male", 3, "default breed", 7, "normal");

        Animal dog = new Dog("female", 8, "doberman", true);


        List<Animal> animalList = new ArrayList<>();
        animalList.add(cat);
        animalList.add(dog);
        animalList.add(animal);


        System.out.println(animalList);
    }
}
