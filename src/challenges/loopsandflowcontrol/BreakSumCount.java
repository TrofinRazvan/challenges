package challenges.loopsandflowcontrol;

import java.util.Scanner;

public class BreakSumCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            sum += number;

            if (count == 2){
                break;
            }
            count++;
        }
        System.out.println("The sum of the numbers is: " + sum);

        scanner.close();
    }
}