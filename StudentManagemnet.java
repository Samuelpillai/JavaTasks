package myTaskJavaPackage;
import java.util.Scanner;
public class StudentManagemnet {

    int rollNum;
    String name;

    int age;
    String course;

    public StudentManagemnet(int rollNum, String name, int age, String course) throws NameNotValidException, AgeNotWithinRangeException {
        this.rollNum = rollNum;
        setName(name);
        setAge(age);
        this.course = course;
    }

    public void setName(String name) throws NameNotValidException {
        String regex = "^[aA-zZ\\s]+$";
        if (!name.matches(regex)) {
            throw new NameNotValidException("Name should not contain the numbers and special symbols.");
        }
        this.name = name;
    }

    public void setAge(int age) throws AgeNotWithinRangeException {
        if (age>15 && age<21) {
            throw new AgeNotWithinRangeException("Age Should be between 15 and 21.");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentManagemnet{" +
                "rollNum=" + rollNum +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", course='" + course + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the roll number: ");
        int rollNum = sc.nextInt();
        System.out.println("Enter the name: ");
        String name = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter the age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the course: ");
        String course = sc.nextLine();

        try{
            StudentManagemnet sm = new StudentManagemnet(rollNum, name, age, course);
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            throw new RuntimeException(e);
        }
    }
}

