package myTaskJavaPackage;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class calculateAgeByBirthday {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your birthday (yyyy-mm-dd): ");
        String input = sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate birthday;
        try {
            birthday = LocalDate.parse(input, formatter);
        } catch (Exception e){
            System.out.println("Error in format of yyyy-MM-dd. Please make sure it's in the format yyyy-MM-dd.");
            return;
        }

        LocalDate now = LocalDate.now();
        Period age = Period.between(birthday, now);

        long years = age.getYears();
        long months = age.getMonths();
        long days = age.getDays();

        System.out.println("Your age is: "+ years+" years, "+months+" months and "+days+" days.");
    }
}
