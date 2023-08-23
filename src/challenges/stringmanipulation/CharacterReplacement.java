package challenges.stringmanipulation;

import java.util.Scanner;

public class CharacterReplacement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string:");
        String input = scanner.nextLine();

        System.out.println("Enter the character to be replaced:");
        char targetChar = scanner.next().charAt(0);

        System.out.println("Enter the replacement character:");
        char replacementChar = scanner.next().charAt(0);

        String modifiedString = input.replace(targetChar, replacementChar);

        System.out.println("Modified string: " + modifiedString);

        scanner.close();
    }
}
