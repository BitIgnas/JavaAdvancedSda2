package Abstraction.Example2;


    /*
    Abstract class can not be instatianed(no object creation with New keyword
    -Extends keyword needs to be used to use the CLASS
    -Might include abstract methods
    -Fields, non-abstract, a static method work ing regular way

    Purpose of abstraction - hide implementation details from the client (class that extends it)

    -Abstract class defines what OBJECT is. Partiallu abstract. Might include concrete implementations. Extentends.
    -Interface defines what objects does (what can do) Interface is purely abstract. Implements.

    -an ABSTRACT class can have shared state or functionality

     */

public class AbstractDemo {
    public static void main(String[] args) {
        Bank swedbank = new Swedbank();
        swedbank.deposit();
        swedbank.withdraw();
        swedbank.calculateSpecificBankTax();

        Bank seb = new SEB();
        seb.deposit();
        seb.withdraw();
        seb.calculateSpecificBankTax();
    }
}

abstract class Bank{
    public int commonBankTax = 5;

    public void deposit(){
        System.out.println("Commonm deposit method for all banks");
    }

    public void withdraw(){
        System.out.println("Common withdrawal method for all banks");
    }

    public abstract void calculateSpecificBankTax();
}

class Swedbank extends Bank{

    @Override
    public void calculateSpecificBankTax() {
        System.out.println("Swedbank tax amount - " + 15);
        System.out.println("Common bank tax applies - " + commonBankTax);
    }
}

class SEB extends Bank{

    @Override
    public void calculateSpecificBankTax() {
        System.out.println("Seb tax amount " + 17);
        System.out.println("Common bank tax applies - " + commonBankTax);
    }
}
