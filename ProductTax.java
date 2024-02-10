package myTaskJavaPackage;

public class ProductTax implements Taxable{

    int pid;
    double price;
    int quantity;

    public ProductTax(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public double calcTax() {
        return price*quantity*salesTax;
    }
}
