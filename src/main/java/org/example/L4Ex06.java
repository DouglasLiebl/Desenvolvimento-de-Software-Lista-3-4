package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class L4Ex06 {

    private static void totalCostCalculator(Scanner input) {
        try {
            double value = 0, totalCost = 0, averagePrice = 0;

            System.out.print("Enter total CDs number: ");
            int n = input.nextInt();

            System.out.println("Now enter CDs individual price:");
            for (int i = 0; i < n; i++) {
                System.out.printf("%dº price:", i + 1);
                value = input.nextDouble();
                totalCost += value;
                averagePrice += value;
            }

            averagePrice /= n;

            System.out.printf("""
                    Results:
                    Number total of CDs: %d\s
                    Total value: U$ %.2f\s
                    Average price: U$ %.2f
                    """, n, totalCost, averagePrice);
        } catch (Exception e) {
            if (e instanceof InputMismatchException) System.out.println("Only numbers are accepted.");
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

        totalCostCalculator(new Scanner(System.in));
    }
}
