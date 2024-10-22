import java.util.Scanner;
import controller.ProductController;

public class Main {
    public static void main(String[] args) {

        // Configuring Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("\nWelcome to product Management System");

        while (true) {
            // Displaying Options available
            System.out.println("1. Make a product");
            System.out.println("2. View a product");
            System.out.println("3. Update a product");
            System.out.println("4. Delete a product");
            System.out.println("5. Quit");

            System.out.println("Enter a choice: ");
            int choice = sc.nextInt();

            // Product controller object
            ProductController pController = new ProductController();

            switch (choice) {
                case 1:

                    System.out.println("Enter name: ");
                    String name = sc.next();

                    System.out.println("Enter Description: ");
                    String description = sc.next();

                    System.out.println("Enter price: ");
                    int price = sc.nextInt();

                    pController.addProduct(name, description, price);
                    break;
                case 2:
                    System.out.println("QUITTING");
                    break;
                default:
                    break;
            }

            if (choice == 2){
                break;
            }
        }

    }
}
