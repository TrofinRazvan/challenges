package challenges.list.list.linkedlist;
//Write a Java program to clone a linked list to another linked list.

import java.util.LinkedList;

public class Clone {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

//        LinkedList<Integer> list2 = new LinkedList<>(list);
//        System.out.println(list2);

        System.out.println(clonedLinkedList(list));
    }

    public static <T> LinkedList<T> clonedLinkedList(LinkedList<T> originalList) {
        LinkedList<T> clonedList = new LinkedList<>();

        for (T element : originalList) {
            clonedList.add(element);
        }
        return clonedList;
    }
}