package myTaskJavaPackage;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class XYZ {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product[] products = new Product[5];

        /*products[0] = new Product(1, 100, 2);
        products[1] = new Product(2, 100, 1);
        products[2] = new Product(3, 300, 3);
        products[3] = new Product(4, 400, 4);
        products[4] = new Product(5, 500, 5);*/

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter pid of product " + (i + 1) + ":");
            int pid = sc.nextInt();
            System.out.println("Enter price of product " + (i + 1) + ":");
            double price = sc.nextDouble();
            System.out.println("Enter quantity of product " + (i + 1) + ":");
            int quantity = sc.nextInt();

            products[i] = new Product(pid, price, quantity);
        }

        int highestPricepid = findHighestPrice(products);
        System.out.println("Highest price of pid :  " + highestPricepid);

        double totalAmountspent = totalAmount(products);
        System.out.println("Total amount spent on all product : "+ totalAmountspent);
    }

    public static int findHighestPrice(Product[] products) {
        return Arrays.stream(products)
                .max(Comparator.comparing(Product::getPrice))
                        .get()
                        .getPid();
    }
    public static double totalAmount(Product[] products) {
        return Arrays.stream(products)
                .mapToDouble(product -> product.getPrice() * product.getQuantity())
                .sum();
    }
}
