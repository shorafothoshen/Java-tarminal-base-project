package FoodPanda;

import java.util.Scanner;

class FoodPandaApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DeliveryService delivery = new DeliveryService("Alice");

        while (true) {
            System.out.println("\n===== Food Panda Order System =====");
            System.out.println("1. Place Order");
            System.out.println("2. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            if (choice == 2) {
                System.out.println("Exiting the Food Panda App...");
                scanner.close();
                System.exit(0); 
            }

            scanner.nextLine();

            System.out.print("Enter food item name: ");
            String foodItem = scanner.nextLine();

            System.out.print("Enter price: ");
            double price = scanner.nextDouble();

            DeliveryService.Order order = delivery.new Order(foodItem, price);

            System.out.println("Total Cost: $" + order.calculateTotal());

            System.out.print("Press 1 to Deliver Order: ");
            int deliverChoice = scanner.nextInt();
            if (deliverChoice == 1) {
                order.deliverOrder();
            }
        }
    }
}