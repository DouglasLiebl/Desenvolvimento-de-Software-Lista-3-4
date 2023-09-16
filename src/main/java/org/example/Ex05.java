package org.example;

import java.util.Scanner;

public class Ex05 {

    static String PASSWORD = "2023";
    
    private static void passwordComparator(Scanner input) {
        try {

            while(true) {
                System.out.println("Enter your password:");
                String pass = input.nextLine();

                if(pass.equals(PASSWORD)) {
                    System.out.println("Access Allowed. ");
                    break;
                }

                System.out.println("Invalid password.");
            }


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

        passwordComparator(new Scanner(System.in));
    }
}
