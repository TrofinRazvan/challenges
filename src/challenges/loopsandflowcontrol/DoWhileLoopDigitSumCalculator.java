package challenges.loopsandflowcontrol;

import java.util.Scanner;

public class DoWhileLoopDigitSumCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        int sum = 0;

        do {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        } while (number > 0);

        System.out.println("The sum of the digits of " + originalNumber + " is: " + sum);

        scanner.close();
    }
}