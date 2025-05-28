package ShoppingApp;

import java.util.Scanner;

class AmazonApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Amazon Shopping =====");
            System.out.println("1. Buy Book");
            System.out.println("2. Buy Electronics");
            System.out.println("3. Buy Clothing");
            System.out.println("4. Exit");
            System.out.print("Choose a product: ");
            int choice = scanner.nextInt();

            if (choice == 4) {
                System.out.println("Exiting the Amazon Shopping App...");
                scanner.close();
                System.exit(0); 
            }

            scanner.nextLine(); 

            System.out.print("Enter product name: ");
            String productName = scanner.nextLine();

            System.out.print("Enter price: ");
            double price = scanner.nextDouble();

            Product product = null;

            switch (choice) {
                case 1:
                    product = new Book(productName, price);
                    break;
                case 2:
                    product = new Electronics(productName, price);
                    break;
                case 3:
                    product = new Clothing(productName, price);
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
                    continue;
            }

            System.out.println("Final Price after discount: $" + product.applyDiscount());
        }
    }
}