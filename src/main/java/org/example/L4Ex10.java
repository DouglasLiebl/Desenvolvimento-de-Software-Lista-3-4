package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class L4Ex10 {

    private static void numberReceiver(Scanner input) {
        try {
            int bigger = 0, smaller = 0, average = 0;

            for (int i = 0; i < 200; i++) {
                System.out.printf("Enter %dº number: ", i + 1);
                int n = input.nextInt();

                if (n < 0) throw new RuntimeException("Numbers must be positive. Breaking...");

                if (n > bigger) bigger = n;
                if (n < smaller || i == 0) smaller = n;
                average += n;
            }

            average /= 200;

            System.out.printf("""
                    Bigger Number: %d\s
                    Smaller Number: %d\s
                    Average: %d
                    """, bigger, smaller, average);

        } catch (Exception e) {
            if (e instanceof InputMismatchException) System.out.println("Only Integers numbers are allowed. Breaking...");
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

        numberReceiver(new Scanner(System.in));
    }
}
