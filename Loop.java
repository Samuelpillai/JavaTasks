package myTaskJavaPackage;
import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a initial value: ");
        int num = sc.nextInt();
        System.out.println("Enter a condition value: ");
        int i = sc.nextInt();
        if(num > i) {
            for (int j = i; j <= num; j++) {
                System.out.println(j);
            }
        } else if (i > num) {
            for (int j = num; j <= i; j++) {
                System.out.println(j);
            }
        }
    }
}
