package challenges.list.list.linkedlist;

import java.util.LinkedList;

public class Remove {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        System.out.println("Original linked list: " + linkedList);

        Integer integer = 2;
        boolean isRemoved = linkedList.remove(integer);
        if (isRemoved) {
            System.out.println("Element '" + integer + "' removed successfully.");
        } else {
            System.out.println("Element '" + integer + "' not found iin the LinkedList.");
        }

        System.out.println("Modified LinkedList: " + linkedList);
    }
}