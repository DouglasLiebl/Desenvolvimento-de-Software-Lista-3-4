package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class L4Ex07 {

    private static void breadPriceRegister(Scanner input) {
        try {
            System.out.print("Enter the price of bread: ");
            double price = input.nextDouble();

            System.out.println("Pão de Ontem Bakery - Price Table:");
            for (int i = 1; i <= 50; i++) System.out.printf("%d - R$ %.2f\n", i, (i * price));

        } catch (Exception e) {
            if (e instanceof InputMismatchException) System.out.println("Only numbers are allowed. Start again.");
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

        breadPriceRegister(new Scanner(System.in));
    }
}