
import java.util.Scanner;

public class trylang {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Declare arrays
        String[] names = new String[5];
        double[] programming = new double[5];
        double[] mathematics = new double[5];
        double[] english = new double[5];
        double[] average = new double[5];

        // Input student information
        System.out.println("===== PSU STUDENT MONITORING SYSTEM =====");

        for (int i = 0; i < 5; i++) {

            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter student name: ");
            names[i] = sc.nextLine();

            System.out.print("Enter Programming grade: ");
            programming[i] = sc.nextDouble();

            System.out.print("Enter Mathematics grade: ");
            mathematics[i] = sc.nextDouble();

            System.out.print("Enter English grade: ");
            english[i] = sc.nextDouble();

            sc.nextLine();

            // Calculate average
            average[i] = (programming[i] +
                    mathematics[i] +
                    english[i]) / 3;
        }

        // Display student results
        System.out.println("\n===== STUDENT RESULTS =====");

        for (int i = 0; i < 5; i++) {

            System.out.println("\nStudent Name: " + names[i]);

            System.out.printf("Average: %.2f%n", average[i]);

            if (average[i] >= 90) {
                System.out.println("Status: Excellent");

            } else if (average[i] >= 85) {
                System.out.println("Status: Very Good");

            } else if (average[i] >= 80) {
                System.out.println("Status: Good");

            } else if (average[i] >= 75) {
                System.out.println("Status: Passed");

            } else {
                System.out.println("Status: Failed");
            }
        }

        System.out.println("\n===== END OF REPORT =====");

        sc.close();
    }
}
