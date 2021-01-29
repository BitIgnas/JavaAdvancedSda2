package Exception.Example2;

/*
Errors may occur by the fault of programmer , wrong input, other unpredictable things

Normally if unexpected error will pop up - program will crash

Withe the help of Exceptions, we can continue to execute the program
 */
public class ExceptionTester2 {
    public static void main(String[] args) {
        System.out.println("Programming started...");

        System.out.println("Starting calculation");
        try{
            int x = 5 / 0;
        } catch (ArithmeticException exception){
            System.out.println("Exception is caught and handled. Moving forward...");
        } catch ( Exception ex){
            System.out.println("Unknown problem");
        }




        System.out.println("Moving forward...");
    }
}
