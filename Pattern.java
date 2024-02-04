package myTaskJavaPackage;
import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.println("Here is your pattern : ");

        for(int i = rows; i > 0; i--) {
            for (int j  = i; j > 0; j--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

}
