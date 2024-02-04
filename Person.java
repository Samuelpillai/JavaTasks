package myTaskJavaPackage;
import java.util.Scanner;
public class Person {

    public String name;
    public int age;
    public Person() {
        this.name = name;
        this.setAge(age);
    }
    public Person(String name) {
        this.name = name;
        this.age = 18;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age <= 0) {
            this.age = 18;
        } else {
            this.age = age;
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name : ");
        String name = sc.nextLine();
        System.out.println("Enter a age : ");
        int age = sc.nextInt();

        Person person = new Person();
        person.name = name;
        person.setAge(age);

        System.out.println("Name is "+person.name);
        System.out.println("Age is "+person.getAge());


    }
}
