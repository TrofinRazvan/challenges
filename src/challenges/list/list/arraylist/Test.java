package challenges.list.list.arraylist;
//Write a Java program to test an array list is empty or not.

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Object> objectList = new ArrayList<>();
        objectList.add("21");
        objectList.add(21);
        objectList.add(76);
        objectList.add(9.000);

        if (objectList.isEmpty()) {
            System.out.println("The ArrayList is empty");
        } else {
            System.out.println("The ArrayList is not empty.");
        }
    }
}