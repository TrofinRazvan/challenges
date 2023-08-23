package challenges.loopsandflowcontrol;

import java.util.Scanner;

public class WhileLoopPrimeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        boolean isPrime = true;
        int divisor = 2;

        if (number <= 1) {
            isPrime = false;
        } else {
            while (divisor <= Math.sqrt(number)) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
                divisor++;
            }
        }
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }
}