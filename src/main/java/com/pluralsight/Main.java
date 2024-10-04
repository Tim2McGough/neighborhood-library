package com.pluralsight;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("Hello, please type in one of the following options:");
            System.out.println("1 - Show available books");
            System.out.println("2 - Show books currently checked out");
            System.out.println("3 - Exit");

            String option = keyboard.nextLine();

            if (option.equals("1")) {
                // This will show available books in the next step
            } else if (option.equals("2")) {
                // This will show unavailable books in the next step
            } else if (option.equals("3")) {
                System.out.println("Goodbye!");
                break;
            } else
                System.out.println("Invalid option. Please try again.");
        }
    }
}