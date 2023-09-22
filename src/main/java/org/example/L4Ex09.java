package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class L4Ex09 {

    private static void checkInterval(Scanner input) {
        try {
            int interval1 = 0, interval2 = 0, interval3 = 0, interval4 = 0, outOfBounds = 0;

            for (int i = 0; i < 4; i++) {
                System.out.printf("Enter %dº number: ", i + 1);
                double num = input.nextDouble();

                if (num >= 0 && num <=25) interval1 += 1;
                else if (num > 25 && num <= 50 ) interval2 += 1;
                else if (num > 50 && num <= 75) interval3 += 1;
                else if (num > 75 && num <= 100) interval4 += 1;
                else outOfBounds += 1;
            }

            System.out.printf("""
                    Results:\s
                    [0, 25] -> %d\s
                    [26, 50] -> %d\s
                    [51, 75] -> %d\s
                    [76, 100] -> %d\s
                    Out of Bounds -> %d
                    """, interval1, interval2, interval3, interval4, outOfBounds);

        } catch (Exception e) {
            if (e instanceof InputMismatchException) System.out.println("Only numbers are allowed. Breaking...");
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

        checkInterval(new Scanner(System.in));
    }
}
