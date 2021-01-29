package Interface.Example2;

/*
Rule - class should not worry about the calculator object instance
This class should only use it

We can inject implementations or dependencies via;
Construct
setters
Methods
 */

public class TaxReport {

    public TaxReport(TaxCalculator2020 taxCulculator2020) {
        this.taxCulculator2020 = taxCulculator2020;
    }

    private TaxCalculator2020 taxCulculator2020;

    private TaxCalculator taxCalculator;


    public void showCalculatedTax(){

    }
}