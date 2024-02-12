package myTaskJavaPackage;

import java.util.HashMap;
import java.util.Scanner;
public class StudentGradeMap {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentGradeMap SGM = new StudentGradeMap();
        System.out.println("Enter number of students to add on map.");
        int count = sc.nextInt();
        sc.nextLine();

        for (int i=0; i<count;i++) {
            System.out.println("Enter the name of student "+(i+1)+": ");
            String name = sc.nextLine();
            System.out.println("Enter the grade of student "+(i+1)+": ");
            int grades = sc.nextInt();
            sc.nextLine();
            SGM.addStudent(name, grades);
        }
        while(true) {
            System.out.println("Enter the operation (display/remove/exit):");
            String operation = sc.nextLine();

            if (operation.equalsIgnoreCase("display")) {
                System.out.println("Enter the name of the student to display the grade: ");
                String displayName = sc.nextLine();
                SGM.displayStudent(displayName);
            } else if(operation.equalsIgnoreCase("remove")) {
                System.out.println("Enter the name of student to remove: ");
                String removeName = sc.nextLine();
                SGM.removeStudent(removeName);
                System.out.println(SGM);
            } else if(operation.equalsIgnoreCase("exit")) {
                break;
            } else {
                System.out.println("Ivnvalid operation.");
            }
        }

    }
    private HashMap<String, Integer> studentGradeMap;

    public StudentGradeMap() {
        this.studentGradeMap = new HashMap<>();
    }
    public void addStudent(String name, int grade) {
        studentGradeMap.put(name, grade);
    }
    public void removeStudent(String name) {
        studentGradeMap.remove(name);
    }
    public void displayStudent(String name) {
        if(studentGradeMap.containsKey(name)) {
            System.out.println("The grade for "+name+" is: "+studentGradeMap.get(name));
        } else {
            System.out.println(name +" is not in the map.");
        }
    }
}
