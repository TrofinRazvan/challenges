package challenges.stringmanipulation;

import java.util.Scanner;

public class StringLengthTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the numbers of string: ");
        int numStrings = Integer.parseInt(scanner.nextLine());

        for (int index = 0; index < numStrings; index++) {
            System.out.println("Enter a string: ");
            String input = scanner.nextLine();

            int length = input.length();

            System.out.println("Lenght of the string: " + length);
        }
        System.out.println("There are " + numStrings + " strings.");

        scanner.close();
    }
}