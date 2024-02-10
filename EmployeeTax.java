package myTaskJavaPackage;

public class EmployeeTax implements Taxable{

    int employeeID;
    String name;

    double salary;

    public EmployeeTax(int employeeID, String name, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double calcTax() {
        return salary*incomeTax;
    }
}
