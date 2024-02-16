package challenges.list.list.arraylist;
//Write a Java program to create a new array list, add some colors (string) and print out the collection.

import java.util.ArrayList;
import java.util.List;

public class Create {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("blue");
        list.add("black");
        list.add("green");
        list.add("yellow");

        for (String display : list) {
            System.out.println(display);
        }
        System.out.println(list);
    }
}