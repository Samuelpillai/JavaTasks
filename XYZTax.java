package myTaskJavaPackage;
import java.util.Scanner;
public class XYZTax {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employeeID: ");
        int employeeID = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name: ");
        String name = sc.nextLine();
        System.out.println("Enter the salary: ");
        double salary = sc.nextDouble();

        EmployeeTax employeeTax = new EmployeeTax(employeeID, name, salary);
        System.out.println("Income tax for employee with ID \n Name: "+name+" , ID: "+employeeID+" , Total Tax: "+employeeTax.calcTax());

        System.out.println("Enter the pid of product: ");
        int pid = sc.nextInt();
        System.out.println("Enter the price of product: ");
        double price = sc.nextDouble();
        System.out.println("Enter the quantity of product: ");
        int quantity = sc.nextInt();

        ProductTax productTax = new ProductTax(pid, price, quantity);
        System.out.println("Income tax for product \n Pid: "+pid+" Product Tax: "+productTax.calcTax());
    }
}
