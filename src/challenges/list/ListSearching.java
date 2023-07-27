package challenges.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListSearching {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("Ion");
        stringList.add("Marica");
        stringList.add("Alex");
        stringList.add("Ioana");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to search for: ");
        String searchString = scanner.nextLine();
        if (searchString.contains(searchString)) {
            System.out.println("The string '" + searchString + "' was found in the list.");
        } else {
            System.out.println("The string '" + searchString + "' was not found in the list.");
        }
    }
}
