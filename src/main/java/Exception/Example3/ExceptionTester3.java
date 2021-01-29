package Exception.Example3;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class ExceptionTester3 {
    public static void main(String[] args) {
        int[] array = {1,2};
        System.out.println("Programa prasideda");


        try{
            array[3] = 5;
        } catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Wrong inputed array element");
            //custom logic
            array[0] = 55;
        } finally {
            //doing finishing work of action
            System.out.println("Visada vykdomas gale");
        }

        System.out.println(array[0]);
    }


}
