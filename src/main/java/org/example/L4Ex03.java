package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class L4Ex03 {

    private static void sum(Scanner input) {
        try {

            int sum = 0;

            System.out.println("Enter the start number: ");
            int startNumber = input.nextInt();

            System.out.println("Enter the end number: ");
            int endNumber = input.nextInt();

            for (int i = startNumber + 1; i < endNumber; i++) {
                sum += i;
            }

            System.out.printf("Sum of the numbers between %d and %d: %d", startNumber, endNumber, sum);

        } catch (InputMismatchException e) {
            System.out.println("Characters or floating point numbers are not allowed.");
        }
    }

    public static void main(String[] args) {

        sum(new Scanner(System.in));
    }

}
