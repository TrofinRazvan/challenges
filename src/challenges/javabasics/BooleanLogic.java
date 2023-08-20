package challenges.javabasics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BooleanLogic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Enter the first boolean value: ");
                boolean valueOne = scanner.nextBoolean();

                System.out.println("Enter the second booleam value: ");
                boolean valueTwo = scanner.nextBoolean();

                System.out.println("Logical AND (&&) Result: " + (valueOne && valueTwo));
                System.out.println("Logical OR (||) Result: " + (valueOne || valueTwo));
                System.out.println("Logical NOT (!) Result for the first value: " + !valueOne);
                System.out.println("Logical NOT (!) Result for the second value: " + !valueTwo);
            } catch (InputMismatchException e) {
                System.out.println("Input error! Please enter 'true' or 'false'.");
                scanner.nextLine();
            } finally {
                System.out.println("Do you want to continue? Please type 'yes' or 'no'");
                String continueRunning = scanner.nextLine().toLowerCase();
                if (!continueRunning.equals("yes")) {
                    break;
                }
            }
        }
        scanner.close();
    }
}