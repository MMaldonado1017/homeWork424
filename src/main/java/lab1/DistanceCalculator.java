package lab1;

import java.util.Scanner;

public class DistanceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Print header
        System.out.println("Product\tQty\tPrice\tMiles\tTotal");
        System.out.println("------\t---\t-----\t-----\t-----");

        // Ask for input
        System.out.print("Enter product name: ");
        String productName = scanner.nextLine();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter distance in miles: ");
        double distance = scanner.nextDouble();

        // Calculate total cost based on distance
        double totalCost;
        if (distance >= 51) {
            totalCost = (quantity * price) + 20;
        } else if (distance >= 26) {
            totalCost = (quantity * price) + 15;
        } else if (distance >= 16) {
            totalCost = (quantity * price) + 10;
        } else if (distance >= 5) {
            totalCost = (quantity * price) + 5;
        } else {
            totalCost = (quantity * price) + 2;
        }

        // Print output
        System.out.printf("%s\t%d\t%.2f\t%.1f\t%.2f\n",productName, quantity, price, distance, totalCost);
        System.out.println("Thank you. Come Again!");
    }
}
