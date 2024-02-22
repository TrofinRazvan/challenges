package challenges.list.list.arraylist;
//Write a Java program to insert an element into the array list at the first position.

import java.util.ArrayList;
import java.util.List;

public class Insert {

    public static void main(String[] args) {

        List<Integer> array = new ArrayList<>();
        int firstPosition = 43;
        array.add(53);
        array.add(3);
        array.add(-32);

        array.add(1, firstPosition);
        System.out.println(array);
    }
}