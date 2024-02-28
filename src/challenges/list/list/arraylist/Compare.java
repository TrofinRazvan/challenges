package challenges.list.list.arraylist;

import java.util.ArrayList;

//Write a Java program to compare two array lists.
public class Compare {

    public static void main(String[] args) {
        ArrayList<Integer> arrayListOne = new ArrayList<>();
        arrayListOne.add(11);
        arrayListOne.add(12);
        arrayListOne.add(13);

        ArrayList<Integer> arrayListTwo = new ArrayList<>();
        arrayListTwo.add(11);
        arrayListTwo.add(12);
        arrayListTwo.add(13);

        System.out.println(compareArrayLists(arrayListOne, arrayListTwo));
    }

    public static String compareArrayLists(ArrayList<Integer> arrayList1, ArrayList<Integer> arrayList2) {
        if (arrayList1.equals(arrayList2)) {
            return "The ArrayLists are equal.";
        } else {
            return "The ArrayLists are not equal.";
        }
    }
}