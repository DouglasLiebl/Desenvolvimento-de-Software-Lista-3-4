package org.example;

import java.util.Scanner;

public class L3Ex07 {

    private static void search(Scanner input) {
        try {
            int fla = 0, vsc = 0, flu = 0, bot = 0, other = 0, intervieweesNumber = 0, niteroi = 0, otherHometown = 0,
                    niteroiAndOtherTeam = 0;
            double averageSalary = 0;

            System.out.println("Enter '0' in Teams session to terminate search.");

            while (true) {
                System.out.println("""
                        Enter your football team:\s
                        [1] Flamengo\s
                        [2] Vasco\s
                        [3] Fluminense\s
                        [4] Botafogo
                        [5] Other""");
                int team = input.nextInt();

                if (team == 0) {
                    averageSalary /= intervieweesNumber;

                    System.out.printf("""
                            Results:\s
                            
                            Teams:\s
                            [1] Flamengo: %d\s
                            [2] Vasco: %d\s
                            [3] Fluminense: %d\s
                            [4] Botafogo: %d\s
                            [5] Other: %d\s
                            
                            Average Salary: R$ %.2f\s
                            
                            Number of people born in Niterói: %d\s
                            Number of people who have another home Town: %d\s
                            
                            Number of people born in Niterói and who do not support any of the main teams
                            clubs in Rio : %d\s
                            
                            Number of people interviewed: %d\s
                            
                   
                            """, fla, vsc, flu, bot, other, averageSalary, niteroi, otherHometown, niteroiAndOtherTeam, intervieweesNumber);
                    break;
                }

                switch (team) {
                    case 1 -> fla += 1;
                    case 2 -> vsc += 1;
                    case 3 -> flu += 1;
                    case 4 -> bot += 1;
                    case 5 -> other += 1;
                    default -> throw new IllegalStateException("Invalid value: " + team);
                }

                System.out.println("Enter your salary: ");
                averageSalary += input.nextDouble();

                System.out.println("""
                         Enter your hometown:\s
                         [1] Niterói
                         [2] Other""");
                int hometown = input.nextInt();

                if (hometown == 1 && team == 5) {
                   niteroi += 1;
                   niteroiAndOtherTeam += 1;
                } else {
                   switch (hometown) {
                       case 1 -> niteroi += 1;
                       case 2 -> otherHometown += 1;
                       default -> throw new IllegalStateException("Invalid value: " + hometown);
                   }
                }

                intervieweesNumber += 1;
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        search(new Scanner(System.in));
    }
}
