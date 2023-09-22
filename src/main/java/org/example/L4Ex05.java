package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class L4Ex05 {

    private static void multiplicationTable(Scanner input) {
        try {
            System.out.print("Enter the number you want to print the multiplication table: ");
            int n = input.nextInt();

            System.out.printf("%d Multiplication table: \n", n);
            for (int i = 1; i <= 10; i++) System.out.printf("%d X %d = %d \n", n, i, (n * i));

        } catch (Exception e) {
            if (e instanceof InputMismatchException) System.out.println("Characters and floating point numbers are not allowed. Breaking...");
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

        multiplicationTable(new Scanner(System.in));
    }
}
