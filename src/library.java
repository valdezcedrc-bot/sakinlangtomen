
import java.util.Scanner;

public class library {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Declare arrays
        String[] books = {
                "Java Programming",
                "Mathematics",
                "English Grammar",
                "Computer Fundamentals",
                "Science"
        };

        int[] copies = {5, 3, 4, 2, 6};

        String search;
        boolean found = false;

        // Display inventory
        System.out.println("===== PSU LIBRARY INVENTORY =====");

        for (int i = 0; i < 5; i++) {

            System.out.println((i + 1) + ". " + books[i] +
                    " - Available Copies: " + copies[i]);
        }

        // Search for a book
        System.out.println("\n===== BOOK SEARCH =====");

        System.out.print("Enter book title to search: ");
        search = sc.nextLine();

        for (int i = 0; i < 5; i++) {

            if (books[i].equalsIgnoreCase(search)) {

                found = true;

                System.out.println("\nBook Found!");
                System.out.println("Title: " + books[i]);
                System.out.println("Available Copies: " + copies[i]);

                // Borrow a book
                if (copies[i] > 0) {

                    System.out.print("\nDo you want to borrow this book? (yes/no): ");
                    String choice = sc.nextLine();

                    if (choice.equalsIgnoreCase("yes")) {

                        copies[i]--;

                        System.out.println("\nBook successfully borrowed!");
                        System.out.println("Remaining Copies: " + copies[i]);

                    } else {
                        System.out.println("Borrowing cancelled.");
                    }

                } else {
                    System.out.println("Sorry, no copies available.");
                }

                break;
            }
        }

        // If book does not exist
        if (!found) {
            System.out.println("\nBook Not Found!");
        }

        // Display updated inventory
        System.out.println("\n===== UPDATED INVENTORY =====");

        for (int i = 0; i < 5; i++) {

            System.out.println(books[i] +
                    " - Available Copies: " + copies[i]);
        }

        sc.close();
    }
}
