package challenges.javabasics;

import java.util.Scanner;

public class CharToIntConversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a single character: ");
        char character = scanner.next().charAt(0);

        int numericValue = Character.getNumericValue(character);

        if (numericValue >= 0) {
            System.out.println("Numeric value of '" + character + "' is: " + numericValue);
        } else {
            System.out.println("Character is not a numeric digit.");
        }

        scanner.close();
    }
}