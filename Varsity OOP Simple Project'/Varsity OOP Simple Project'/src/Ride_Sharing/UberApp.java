package Ride_Sharing;

import java.util.Scanner;

class UberApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select Ride Type (1: UberX, 2: UberXL, 3: UberPool, 4: Exit): ");
            int rideType = scanner.nextInt();

            if (rideType == 4) { 
                System.out.println("Exiting the program...");
                scanner.close();
                System.exit(0);
            }

            Ride myRide = null;

            switch (rideType) {
                case 1:
                    myRide = new UberX("Rakib", 3);
                    break;
                case 2:
                    myRide = new UberXL("Kuddus Ali", 6);
                    break;
                case 3:
                    myRide = new UberPool("Kodu Mia", 29);
                    break;
                default:
                    System.out.println("Invalid selection. Please try again.");
                    continue;
            }

            while (true) {
                System.out.print("Enter distance (or 0 to exit): ");
                double distance = scanner.nextDouble();

                if (distance == 0) {
                    System.out.println("Exiting the ride system.");
                    break;
                }

                double fare = myRide.calculateFare(distance);
                System.out.println("Total Fare: $" + fare);

                System.out.print("Rate your ride (1-5): ");
                int rating = scanner.nextInt();
                myRide.rateRide(rating);
            }
        }
    }
}
