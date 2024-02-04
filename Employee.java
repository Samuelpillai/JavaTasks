package myTaskJavaPackage;
public class Employee extends PersonE{

    int employeeID;
    double salary;

    public Employee(String name, int age, int employeeID, double salary) {
        super(name, age);
        this.employeeID = employeeID;
        this.salary = salary;
    }
}
