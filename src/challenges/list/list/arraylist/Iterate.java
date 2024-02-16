package challenges.list.list.arraylist;
//Write a Java program to iterate through all elements in an array list.

import java.util.ArrayList;
import java.util.List;

public class Iterate {

    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add(12);
        list.add("Strings");
        list.add(12.3);

        for (Object i : list) {
            System.out.print(i + " ");
        }
    }
}