package myTaskJavaPackage;

public interface Taxable {

    double salesTax = 0.7;
    double incomeTax = 0.105;

    public abstract double calcTax();

}
