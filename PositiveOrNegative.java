package myTaskJavaPackage;
import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        if(num>=1) {
            System.out.println(num +" is Positive");
        } else {
            System.out.println(num + " is Negative");
        }
    }
}
