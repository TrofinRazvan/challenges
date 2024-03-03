package challenges.list.list.linkedlist;

import java.util.LinkedList;

public class Append {

    public static void main(String[] args) {
        LinkedList<Object> linkedList = new LinkedList<>();
        linkedList.add("1");
        linkedList.add(2);
        linkedList.add("3");

        System.out.println("Original linked list: " + linkedList);

        Integer Integer = 1;
        linkedList.add(Integer);

        System.out.println("Updated linked list: " + linkedList);
    }
}