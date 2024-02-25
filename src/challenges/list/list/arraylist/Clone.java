package challenges.list.list.arraylist;
//Write a Java program to clone an array list to another array list.

import java.util.ArrayList;
import java.util.List;

public class Clone {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(11);
        arrayList.add(12);
        arrayList.add(13);

        List<Integer> clonedList = new ArrayList<>(arrayList);
        System.out.println("Cloned ArrayList: " + clonedList);
    }
}