package IndividualWork.Inheritance.Exercise1.Example2;

public class Animal {
    private String gender;
    private int age;

    public Animal(String gender, int age){
        this.gender = gender;
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
