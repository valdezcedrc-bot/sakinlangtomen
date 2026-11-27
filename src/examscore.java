
import java.util.Scanner;

public class examscore {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] scores = new int[10];

        int highest = 0;
        int lowest = 100;
        int sum = 0;
        int passed = 0;
        int failed = 0;

        double average;

        // Input scores
        System.out.println("===== EXAMINATION SCORE ANALYZER =====");

        for (int i = 0; i < 10; i++) {

            System.out.print("Enter score of Student " + (i + 1) + ": ");
            scores[i] = sc.nextInt();

            sum += scores[i];

            // Find highest score
            if (scores[i] > highest) {
                highest = scores[i];
            }

            // Find lowest score
            if (scores[i] < lowest) {
                lowest = scores[i];
            }

            // Count passed and failed
            if (scores[i] >= 75) {
                passed++;
            } else {
                failed++;
            }
        }

        // Calculate average
        average = (double) sum / 10;

        // Display all scores
        System.out.println("\n===== STUDENT SCORES =====");

        for (int i = 0; i < 10; i++) {
            System.out.println("Student " + (i + 1) +
                    ": " + scores[i]);
        }

        // Display results
        System.out.println("\n===== EXAMINATION RESULTS =====");

        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
        System.out.println("Class Average: " + average);
        System.out.println("Students Passed: " + passed);
        System.out.println("Students Failed: " + failed);

        // Display scores above average
        System.out.println("\n===== ABOVE CLASS AVERAGE =====");

        for (int i = 0; i < 10; i++) {

            if (scores[i] > average) {
                System.out.println("Student " + (i + 1) +
                        ": " + scores[i]);
            }
        }

        sc.close();
    }
}
