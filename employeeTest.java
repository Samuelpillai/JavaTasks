package myTaskJavaPackage;
import java.util.Scanner;
public class employeeTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name : ");
        String name = sc.nextLine();

        System.out.println("Enter the age : ");
        int age = sc.nextInt();

        System.out.println("Enter the employeeID : ");
        int employeeID = sc.nextInt();

        System.out.println("Enter the salary : ");
        double salary = sc.nextDouble();

        Employee employee = new Employee(name, age, employeeID, salary);

        System.out.println("Name: " + employee.name);
        System.out.println("Age: " + employee.age);
        System.out.println("EmployeeID: " + employee.employeeID);
        System.out.println("Salary: " + employee.salary);
    }
}
