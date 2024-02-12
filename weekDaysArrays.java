package myTaskJavaPackage;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class weekDaysArrays {

    public static void main(String[] args) {

        String[] weekdays = {"Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday"};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dayIndex to see the day name: ");
        int dayIndex = sc.nextInt();
        try {
            System.out.println("Day name: "+weekdays[dayIndex]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Enter dayIndex between range (0-6).");
        }
    }

}
