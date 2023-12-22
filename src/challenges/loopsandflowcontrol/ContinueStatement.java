package challenges.loopsandflowcontrol;

import java.util.Scanner;

public class ContinueStatement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = scanner.nextInt();

        int sum = 0;

        for (int index = 0; index < n; index++) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();

            if (number % 2 != 0) {
                continue;
            }
            sum += number;
        }
        System.out.println("Sum of even numbers: " + sum);

        scanner.close();
    }
}
