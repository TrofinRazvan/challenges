package challenges.loopsandflowcontrol;

import java.util.Scanner;

public class ForLoopFactorialCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int factorial = 1;
            for (int index = 1; index <= number; index++) {
                factorial *= index;
            }
            System.out.println("Factorial of " + number + " is: " + factorial);
        }
        scanner.close();
    }
}