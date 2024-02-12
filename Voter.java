package myTaskJavaPackage;
import java.util.Scanner;
public class Voter {

    int voterId;
    String name;
    int age;

    public Voter(int voterId, String name, int age) throws AgeNotWithinRangeException {
        this.voterId = voterId;
        this.name = name;
        setAge(age);
    }

    public void setAge(int age) throws AgeNotWithinRangeException {
        if(age<18) {
            throw new AgeNotWithinRangeException("InvalidAgeForVoter");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Voter{" +
                "voterId=" + voterId +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the voterId number: ");
        int voterId = sc.nextInt();
        System.out.println("Enter the name in voterId: ");
        String name = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter the age of applicant: ");
        int age = sc.nextInt();

        try {
            Voter voter = new Voter(voterId, name, age);
        } catch (AgeNotWithinRangeException e) {
            System.out.println(e.getMessage());
        }
    }
}
