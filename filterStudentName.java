package myTaskJavaPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class filterStudentName {
    public static void main(String[] args) {

        List<String> students = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
//        students.add("bob");
//        students.add("alice");
//        students.add("sam");
//        students.add("adam");
//        students.add("david");
//        students.add("eve");
//        students.add("frank");
//        students.add("grace");
//        students.add("heidi");
//        students.add("antony");

        System.out.println("Enter the name of students: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter name "+ (i+1)+": ");
            String names = sc.nextLine();
            students.add(names);
        }

        List<String> studentWithA = students.stream().filter(s->s.startsWith("a")).collect(Collectors.toList());

        System.out.println("Students whose names start with 'a': " + studentWithA);
    }
}
