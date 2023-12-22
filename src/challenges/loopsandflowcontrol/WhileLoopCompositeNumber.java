package challenges.loopsandflowcontrol;

import java.util.Scanner;

public class WhileLoopCompositeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        boolean isComposite = false;
        int divisor = 2;

        if (number <= 1) {
            System.out.println(number + " is neither prime or composite.");
        } else {
            while (divisor <= Math.sqrt(number)) {
                if (number % divisor == 0) {
                    isComposite = true;
                    break;
                }
                divisor++;
            }
        }
        if (isComposite) {
            System.out.println(number + " is a composite number.");
        } else {
            System.out.println(number + " is a prime number.");
        }

        scanner.close();
    }
}