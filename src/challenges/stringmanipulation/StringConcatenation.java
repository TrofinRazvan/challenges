package challenges.stringmanipulation;

import java.util.Scanner;

public class StringConcatenation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string: ");
        String firstString = scanner.nextLine();

        System.out.println("Enter the second string: ");
        String secondString = scanner.nextLine();

        System.out.println(firstString + " + " + secondString);

        scanner.close();
    }
}
