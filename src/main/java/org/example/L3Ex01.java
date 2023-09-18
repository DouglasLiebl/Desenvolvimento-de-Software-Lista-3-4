package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class L3Ex01 {

    private static void adder(Scanner input) {

        try {
            long sum = 0;

            while(true) {
                System.out.println("Enter a number: [enter 0 to stop]");
                long n = input.nextLong();

                if (n < 0) throw new Exception("Numbers cannot be negative. Breaking...");
                if ((n % 2) != 0 || n == 0) {
                    System.out.printf("Sum of the numbers entered: %d", sum);
                    break;
                }
                sum += n;
            }
        } catch(Exception e) {
            if (e instanceof InputMismatchException) System.out.println("Only numbers are allowed. Breaking...");
            else System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {

       adder(new Scanner(System.in));
    }
}
