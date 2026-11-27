
import java.util.Scanner;

public class pagkain{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Declare arrays
        String[] products = {
                "Rice Meal",
                "Pancit",
                "Burger",
                "Siomai Rice",
                "Sandwich"
        };

        double[] prices = {
                50, 35, 45, 40, 30
        };

        int[] quantity = new int[5];

        double total = 0;
        double discount = 0;
        double finalTotal;

        // Display menu
        System.out.println("================================");
        System.out.println("   PSU UNIVERSITY CANTEEN");
        System.out.println("================================");

        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ". " +
                    products[i] + " - PHP " + prices[i]);
        }

        // Ask for quantities
        System.out.println("\n===== CUSTOMER ORDER =====");

        for (int i = 0; i < 5; i++) {

            System.out.print("Enter quantity for " +
                    products[i] + ": ");

            quantity[i] = sc.nextInt();

            // Calculate total per product
            total += prices[i] * quantity[i];
        }

        // Apply discount
        if (total >= 200) {
            discount = total * 0.10;
        }

        // Calculate final total
        finalTotal = total - discount;

        // Display receipt
        System.out.println("\n================================");
        System.out.println("          OFFICIAL RECEIPT");
        System.out.println("================================");

        for (int i = 0; i < 5; i++) {

            if (quantity[i] > 0) {

                System.out.println(products[i]);
                System.out.println("Quantity: " + quantity[i]);

                System.out.println("Subtotal: PHP " +
                        (prices[i] * quantity[i]));

                System.out.println("--------------------------------");
            }
        }

        System.out.println("Total Amount: PHP " + total);
        System.out.println("Discount: PHP " + discount);
        System.out.println("Final Amount: PHP " + finalTotal);

        if (total >= 200) {
            System.out.println("Congratulations! You received a 10% discount.");
        } else {
            System.out.println("No discount applied.");
        }

        System.out.println("================================");
        System.out.println("     THANK YOU FOR ORDERING!");
        System.out.println("================================");

        sc.close();
    }
}
