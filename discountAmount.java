package myTaskJavaPackage;
import java.util.Scanner;
public class discountAmount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a amount : ");
        int amount = sc.nextInt();

        if (amount >  1000) {
            System.out.println("Total : " + amount*0.80 + " a 20% discount is applied");
        } else if (amount > 500 && amount < 1000) {
            System.out.println("Total : " + amount*0.90 + " , a 10% discount is applied");
        } else {
            System.out.println("Total : " + amount + " , no discount is applied");
        }
    }

}
