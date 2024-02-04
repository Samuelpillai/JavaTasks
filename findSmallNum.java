package myTaskJavaPackage;
import java.util.Scanner;

public class findSmallNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int num = sc.nextInt();

        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();

        System.out.println("Enter third number : ");
        int num3 = sc.nextInt();

        if (num < num2 && num < num3) {
            System.out.println(num + " is smallest number");
        } else if (num2 < num && num2 < num3) {
            System.out.println(num2 + " is smallest number");
        } else if (num3 < num2 && num3 < num) {
            System.out.println(num3 + " is smallest number");
        }

    }
}
