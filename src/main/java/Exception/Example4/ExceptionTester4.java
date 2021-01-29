package Exception.Example4;

public class ExceptionTester4 {
    public static void main(String[] args) {


        int[] numbers = new int[10];

        try {
            int thing = 0;
            int arrayElement = 5;
            int result = numbers[arrayElement] / thing;
            System.out.println(result);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Wrong array element. EXCEPTION");
            specificAction();
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("We cannopt didvide from 0. EXCEPTION ");
        } catch (Exception e) {
            System.out.println("Error not known");
        }
    }

    private static void specificAction() {
        System.out.println("Error logic is happening");
    }
}
