package LeetCode.MainFile.Basic;

//1. Input a year and find whether it is a leap year or not.

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the year (or type 'e' to exit):");

            // Check if the next input is an integer
            if (in.hasNextInt()) {
                int year = in.nextInt();

                // Leap year logic
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println("This is a leap year: " + year);
                } else {
                    System.out.println("This is not a leap year: " + year);
                }

            } else {
                // If it's not an integer, check if it's 'e'
                String input = in.next();
                if (input.equalsIgnoreCase("e")) {
                    System.out.println("Exiting the program.");
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a valid year or 'e' to exit.");
                }
            }
        }

        in.close();
    }
}
