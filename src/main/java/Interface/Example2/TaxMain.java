package Interface.Example2;

public class TaxMain {
    public static void main(String[] args) {
        TaxCalculator2020 taxCulculator2020 = new TaxCalculator2020(500);
        //taxCalculator2020.calculateTax();

        //TaxCalculator taxCalculator= new Calculator2021();


        TaxReport taxReport = new TaxReport(new TaxCalculator2020(500));

    }
}
