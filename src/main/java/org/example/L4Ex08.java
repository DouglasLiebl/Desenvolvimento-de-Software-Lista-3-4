package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class L4Ex08 {

    private static void voteCounter(Scanner input) {
        try {
            int candidate1 = 0, candidate2 = 0, candidate3 = 0;

            System.out.print("Enter the total number of voters: ");
            int n = input.nextInt();

            String model = """
                    Candidates:\s
                    [1] Candidate 1.\s
                    [2] Candidate 2.\s
                    [3] Candidate 3.\s
                    Vote: 
                    """;

            for (int i = 0; i < n; i++) {
                System.out.print(model);
                int vote = input.nextInt();

                switch (vote) {
                    case 1 -> candidate1 += 1;
                    case 2 -> candidate2 += 1;
                    case 3 -> candidate3 += 1;
                    default -> {
                        System.out.println("Invalid Number. Enter again.");
                        i -= 1;
                    }
                }
            }

            System.out.printf("""
                    Results:\s
                    Total votes: %d\s
                    Candidate 1: %d\s
                    Candidate 2: %d\s
                    Candidate 3: %d\s
                    """, n, candidate1, candidate2, candidate3);

        } catch (Exception e) {
            if (e instanceof InputMismatchException) System.out.println("Only Integers numbers are allowed. Start again.");
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

        voteCounter(new Scanner(System.in));
    }
}
