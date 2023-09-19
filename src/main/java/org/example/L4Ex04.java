package org.example;

import java.util.Scanner;

public class L4Ex04 {

    private static void numberComparator(Scanner input) {
        try {
            int bigger = 0;

            for(int i = 0; i < 5; i++) {
                System.out.printf("Enter the %dº number: ", i + 1);
                int n = input.nextInt();

                if (n > bigger) bigger = n;
            }

            System.out.println("Bigger number: " + bigger);

        } catch (Exception e) {
            System.out.println("Characters or floating point numbers are not allowed. Breaking...");
        }
    }


    public static void main(String[] args) {

        numberComparator(new Scanner(System.in));
    }
}
