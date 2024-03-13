package challenges.list.list.linkedlist;

import java.util.LinkedList;

public class Display {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("Elements and their positions in the linked list:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element: " + list.get(i) + ", Position: " + i);
        }
    }
}