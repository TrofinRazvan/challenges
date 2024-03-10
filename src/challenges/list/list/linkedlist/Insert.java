package challenges.list.list.linkedlist;

import java.util.LinkedList;

public class Insert {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Johny");
        list.add("Macorta");
        list.add("!");

        insertElementAtIndex(list, 0, "I");

        System.out.println(list);
    }

    public static void insertElementAtIndex(LinkedList<String> list, int index, String element) {
        if (!list.isEmpty()) {
            list.add(index, element);
        } else {
            System.out.println("Is empty!");
        }
    }
}