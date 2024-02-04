package myTaskJavaPackage;
import java.util.Scanner;
public class reverseNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        int reverse = 0;
        while(num != 0) {
            int remainder = num%10;
            reverse = reverse * 10 + remainder;
            num = num/10;
        }
        System.out.println("Reversed number is " + reverse);
    }
}
