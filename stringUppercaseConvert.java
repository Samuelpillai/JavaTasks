package myTaskJavaPackage;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class stringUppercaseConvert {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        List<String> names = Arrays.asList(sc.nextLine().split(",")).subList(0, numName);

        System.out.println("Enter the names separated by commas(,)");
        System.out.println("Enter the names: ");
        String input = sc.nextLine();

        String[] stringArray = input.split(",");

        Stream<String> names = Arrays.stream(stringArray);

        List<String> upperCaseNames = names.map(String::toUpperCase).collect(Collectors.toList());

        upperCaseNames.forEach(System.out::println);
    }
}
