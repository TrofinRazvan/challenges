package challenges.list.list.linkedlist;

import java.util.LinkedList;

public class Swap {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(11);
        linkedList.add(12);
        linkedList.add(13);

        int index1 = linkedList.size() - 1;
        int index2 = 1;
        int temp = linkedList.get(index1);
        linkedList.set(index1, linkedList.get(index2));
        linkedList.set(index2, temp);

        System.out.println(linkedList);
    }
}