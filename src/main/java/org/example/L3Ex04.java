package org.example;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class L3Ex04 {

    private static void randomizer(Scanner input) {
        try {
            int number = new Random().nextInt(100), count = 0;
            System.out.println("A number between 1 and 100 was drawn. \nTry to get which one it is." + number);
            while (true) {
                System.out.println("Enter a number: ");
                int n = input.nextInt();

                if (n == number) {
                    count += 1;
                    System.out.printf("You win! \nNumber of attempts: %d", count);
                    break;
                } else {
                    if (n < number) {
                        if (n < 0) throw new Exception();
                        System.out.println("The number is bigger than you entered.");
                        count += 1;
                        continue;
                    } else {
                        if (n < 0) throw new Exception();
                        System.out.println("The number is smaller than you entered.");

                    }
                    count += 1;
                }
            }

        } catch (Exception e) {
            if (e instanceof InputMismatchException) System.out.println("Only numbers allowed. Breaking...");
            else System.out.println("Negative or floating points numbers are not allowed. Breaking...");
        }
    }

    public static void main(String[] args) {

        randomizer(new Scanner(System.in));
    }

}
