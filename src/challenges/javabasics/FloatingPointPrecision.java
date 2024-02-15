package challenges.javabasics;

import java.util.Scanner;

public class FloatingPointPrecision {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first floating-point number: ");
        float numberOne = scanner.nextFloat();

        System.out.println("Enter the second floating-point number:");
        float numberTwo = scanner.nextFloat();

        System.out.println("Enter the third floating-point number");
        float numberThree = scanner.nextFloat();

        float sum = numberOne + numberTwo + numberThree;

        if (sum > Float.MAX_VALUE) {
            System.out.println("Sum exceeds the maximum value that can be represented by a float");
        } else {
            float average = sum / 3;
            System.out.println("Average: " + average);
        }
        scanner.close();
    }
}