package challenges.list.list.linkedlist;
//Write a Java program to remove and return the first element of a linked list.

import java.util.LinkedList;

public class RemoveAndReturn {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(removeFirstElement(list));
    }

    public static <T> T removeFirstElement(LinkedList<T> linkedList) {
        if (linkedList.isEmpty()) {
            throw new RuntimeException("List is empty, does not exist something to delete.");
        }
        return linkedList.removeFirst();
    }
}