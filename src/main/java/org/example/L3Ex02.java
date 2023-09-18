package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class L3Ex02 {

    private static void averageCalculator(Scanner input) {
        double average = 0, count = 0;
        try {
            while(true) {
                System.out.println("Enter a number:");
                double n = input.nextDouble();

                if(n < 0) {
                    average /= count;
                    System.out.printf("Average of entered numbers: %.2f", average);
                    break;
                }
                average += n;
                count += 1;
            }

        } catch (Exception e) {
            if (e instanceof InputMismatchException) System.out.println("Only numbers are allowed.");
            else System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {

        averageCalculator(new Scanner(System.in));
    }
}
