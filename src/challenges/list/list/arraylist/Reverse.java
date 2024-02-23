package challenges.list.list.arraylist;
//Write a Java program to reverse elements in an array list.

import java.util.ArrayList;
import java.util.List;

public class Reverse {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(12);
        arrayList.add(133);
        arrayList.add(134);

        int left = 0;
        int right = arrayList.size() - 1;
        while (left < right) {
            int temp = arrayList.get(left);
            arrayList.set(left, arrayList.get(right));
            arrayList.set(right,temp);
            left++;
            right--;
        }

        System.out.println("Reversed ArrayList: " + arrayList);
    }
}