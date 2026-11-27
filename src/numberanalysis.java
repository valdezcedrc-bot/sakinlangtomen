
import java.util.Scanner;

public class numberanalysis {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];

        int even = 0;
        int odd = 0;
        int sum = 0;

        double average;

        // Input numbers
        System.out.println("===== NUMBER ANALYSIS SYSTEM =====");

        for (int i = 0; i < 10; i++) {

            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();

            sum += numbers[i];

            // Check even or odd
            if (numbers[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        // Calculate average
        average = (double) sum / 10;

        // Display all numbers
        System.out.println("\n===== ALL NUMBERS =====");

        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
        }

        // Display even numbers
        System.out.println("\n\n===== EVEN NUMBERS =====");

        for (int i = 0; i < 10; i++) {

            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }

        // Display odd numbers
        System.out.println("\n\n===== ODD NUMBERS =====");

        for (int i = 0; i < 10; i++) {

            if (numbers[i] % 2 != 0) {
                System.out.print(numbers[i] + " ");
            }
        }

        // Display results
        System.out.println("\n\n===== NUMBER STATISTICS =====");

        System.out.println("Total Even Numbers: " + even);
        System.out.println("Total Odd Numbers: " + odd);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        // Reverse order
        System.out.println("\n===== REVERSE ORDER =====");

        for (int i = 9; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

        sc.close();
    }
}
