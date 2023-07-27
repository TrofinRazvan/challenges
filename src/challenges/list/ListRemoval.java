package challenges.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListRemoval {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("Ionel");
        stringList.add("Zbantu");
        stringList.add("Tic");
        stringList.add("Tac");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to remove: ");
        String searchString = scanner.nextLine();
        if (stringList.remove(searchString)) {
            System.out.println("String removed succesfully!");
        } else {
            System.out.println("String not found in the list!");
        }
        System.out.println("Modified list of strings: " + stringList);
    }
}
