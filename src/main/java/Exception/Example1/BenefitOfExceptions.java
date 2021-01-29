package Exception.Example1;

/*
Exception used to handle runtime errors so the normal flow of the application can be maintained.

Exception is thrown only when preconditions are broken. Something unexpected but known happen.

We don't throw for example IncorrectInputException,

we throw ComputerIsOnFire exception

we do not ignore exceptions, we need to handle them and act accordingly.
 */

public class BenefitOfExceptions {
    public static void main(String[] args) {
        System.out.println(calculatePercentage(5, 10));
        System.out.println(calculatePercentageWithException(2,0));


    }

    private static double calculatePercentage(int a, int b){
        // 100 * (a,b) --> formule

        if(b == 0){ //basic error handling
            return -1; // code program to understand what -1 means
        } else {
            return (a/b) * 100;
        }
    }

    private static double calculatePercentageWithException(int a, int b){
        if(b == 0) {
            throw new IllegalArgumentException("Second argument cannot be zero");
        } else {
            return (a/b) * 100;
        }

    }
}
