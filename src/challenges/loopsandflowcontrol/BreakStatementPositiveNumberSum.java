package challenges.loopsandflowcontrol;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BreakStatementPositiveNumberSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        try {
            while (true) {
                System.out.println("Enter the number: ");
                int number = scanner.nextInt();

                if (number < 0) {
                    break;
                }
                sum += number;
            }
            System.out.println("Sum of the positive numbers entered: " + sum);
        } catch (InputMismatchException e) {
            System.out.println("Invalid number format.");
        }
        scanner.close();
    }
}