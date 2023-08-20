package challenges.javabasics;

import java.util.Scanner;

public class FloatingPointPrecisionBatch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three floating-point numbers separated by space.");
        String inputLine = scanner.nextLine();

        String[] numbers = inputLine.split("\\s+");
        if (numbers.length != 3) {
            System.out.println("Please enter exacty three number separated by space.");
            scanner.close();
            return;
        }
        float numberOne = Float.parseFloat(numbers[0]);
        float numberTwo = Float.parseFloat(numbers[1]);
        float numberThree = Float.parseFloat(numbers[2]);
        float sum = numberOne + numberTwo + numberThree;

        if (sum > Float.MAX_VALUE) {
            System.out.println("Sum exceeds the maximum value that can be represented by a float.");
        } else {
            float average = sum / 3;
            System.out.println("Average is: " + average);
        }

        scanner.close();
    }
}
