package challenges.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSorting {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(3);
        integerList.add(7);
        integerList.add(9);
        integerList.add(45);
        Collections.sort(integerList);
        System.out.println("Sorted list of integers: " + integerList);
    }
}
