package challenges.stringmanipulation;

import java.util.Scanner;

public class StringComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String firstString = scanner.nextLine();

        System.out.println("Enter the second string:");
        String secondString = scanner.nextLine();

        if (firstString.equals(secondString)) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }

        scanner.close();
    }
}