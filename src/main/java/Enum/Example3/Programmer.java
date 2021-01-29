package Enum.Example3;

public enum Programmer {

    JUNIOR(1,2000),
    MID(2, 2500),
    SENIOR(3,3000),
    LEAD(5,5000);


    private int experience;
    private int salary;

    Programmer(int experience, int salary) {
        this.experience = experience;
        this.salary = salary;
    }

    public int getExperience(){
        return experience;

    }

    public int getSalary(){
        return salary;

    }
}
