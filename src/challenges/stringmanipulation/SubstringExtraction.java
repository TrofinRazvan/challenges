package challenges.stringmanipulation;

import java.util.Scanner;

public class SubstringExtraction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String string = scanner.nextLine();
        String substring =  string.substring(0,1).toUpperCase();

        System.out.println(substring);

        scanner.close();
    }
}
