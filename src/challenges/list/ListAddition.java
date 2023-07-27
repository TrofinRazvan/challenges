package challenges.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListAddition {

    public static void main(String[] args) {

        List<Integer> numberList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a series of numbers (type 'exit' to stop):");
        while (true) {
            String input = scanner.next();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                numberList.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or type 'exit' to stop.");
            }
        }
        System.out.println("Contents of the lits:");
        for (int number : numberList) {
            System.out.println(number);
        }
    }
}
