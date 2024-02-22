package challenges.list.list.arraylist;
//Write a Java program to retrieve an element (at a specified index) from a given array list.

import java.util.ArrayList;
import java.util.List;

public class Retrieve {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(12);
        arrayList.add(13);
        arrayList.add(14);

        int secondElement = arrayList.get(1);
        System.out.println("On first position is: " + secondElement);
        System.out.println(retrieve(arrayList,2));
    }

    public static int retrieve(List<Integer> arrayList, int position) {
        return arrayList.get(position);
    }
}