package challenges.stringmanipulation;

import java.util.Scanner;

public class ChatracterReplacementTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.next();

        System.out.println("Enter the group of characters to be replaced:");
        String targetGroup = scanner.next();

        System.out.println("Enter the replacement string:");
        String replacementString = scanner.next();

        String modifiedString = input.replace(targetGroup, replacementString);

        System.out.println("Modified string: " + modifiedString);

        scanner.close();
    }
}
