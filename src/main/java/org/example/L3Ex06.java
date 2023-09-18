package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class L3Ex06 {

    private static void fuelTypeSearch(Scanner input) {
        try {
            int alcohol = 0, gasoline = 0, diesel = 0;

            while(true) {
                System.out.println("""
                        Select fuel type:
                        [1] Alcohol.
                        [2] Gasoline.
                        [3] Diesel.
                        [4] End.""");
                int type = input.nextInt();

                switch (type) {
                    case 1 -> alcohol += 1;
                    case 2 -> gasoline += 1;
                    case 3 -> diesel += 1;
                    case 4 -> {
                        System.out.printf("""
                                Results:\s
                                Alcohol: %d\s
                                Gasoline: %d\s
                                Diesel: %d""", alcohol, gasoline, diesel);
                        throw new RuntimeException();
                    }
                    default -> System.out.println("Invalid Number.");
                }

            }

        } catch (Exception e) {
            if (e instanceof InputMismatchException) System.out.println("Only numbers are allowed. Breaking...");
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

        fuelTypeSearch(new Scanner(System.in));
    }
}
