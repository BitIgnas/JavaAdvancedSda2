package Enum.Example3;

public class ProgrammerMain {
    public static void main(String[] args) {
        System.out.println(Programmer.SENIOR);
        System.out.println(Programmer.SENIOR.getSalary());
        for (Programmer singleProgrammer : Programmer.values()) {
            System.out.println("Has years of experience " + singleProgrammer.getExperience());
            System.out.println("Salary is - " + singleProgrammer.getSalary());
        }

    }
}
