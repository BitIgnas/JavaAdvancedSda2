package Exception.Example5;

public class CustomException {
    public static void main(String[] args) {


        try {
            sendingBillingToBank();
        } catch (FailedToSendException exc){
            System.out.println(exc.getMessage());
        }
    }

    private static void sendingBillingToBank() throws FailedToSendException {
        System.out.println("Action is seding......");

        boolean somethingBad = true;
        if(somethingBad){
            throw new FailedToSendException("Billing is not sent");
        }
    }
}
