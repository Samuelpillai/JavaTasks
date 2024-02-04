package myTaskJavaPackage;
import java.util.Scanner;
public class Account {
    double balance;
    double amount;

    public Account() {
        this.balance = 0;
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withDraw(double amount) {
        if (amount > balance) {
            return false;
        } else {
            balance -= amount;
            return true;
        }
    }

    public void displayBalance() {
        System.out.println("The current account balance is: " + balance);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Account account = new Account();

        System.out.println("Enter a amount to deposit : ");
        double amount = sc.nextDouble();

        account.deposit(amount);
        account.displayBalance();

        System.out.println("Enter a amount to withdraw : ");
        double withDraw = sc.nextDouble();

        boolean success = account.withDraw(withDraw);
        if(success) {
            account.displayBalance();
        } else {
            System.out.println("Insuffient balances.");
        }
    }
}
