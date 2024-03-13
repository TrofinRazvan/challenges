package challenges.list.list.linkedlist;
//Write a Java program to get the first and last occurrence of the specified elements in a linked list.

import java.util.LinkedList;

public class Occurrence {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Banana");
        linkedList.add("Grapes");
        linkedList.add("Banana");
        linkedList.add("Mango");

        String elementToFind = "Orange";
        int firstOccurrenceIndex = linkedList.indexOf(elementToFind);
        int lastOccurrenceIndex = linkedList.lastIndexOf(elementToFind);

        if (firstOccurrenceIndex != -1) {
            System.out.println("First occurrence of '" + elementToFind + "' is at index " + firstOccurrenceIndex);
        } else {
            System.out.println("Element '" + elementToFind + "' not found in the list.");
        }

        if (lastOccurrenceIndex != -1) {
            System.out.println("Last occurrence of '" + elementToFind + "' is at index: " + lastOccurrenceIndex);
        } else {
            System.out.println("Element '" + elementToFind + "' not found in the list.");
        }

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);

        int elementToFind2 = 2;
        int firstOccurrenceIndexInt = list.indexOf(elementToFind2);
        int lastOccurrenceIndexInt = list.lastIndexOf(elementToFind2);

        if (firstOccurrenceIndex != -1) {
            System.out.println("First occurrence of '" + elementToFind2 + "' is at index " + firstOccurrenceIndexInt);
        } else {
            System.out.println("Element '" + elementToFind2 + "' not found in the list.");
        }

        if (lastOccurrenceIndex != -1) {
            System.out.println("Last occurrence of '" + elementToFind2 + "' is at index: " + lastOccurrenceIndexInt);
        } else {
            System.out.println("Element '" + elementToFind2 + "' not found in the list.");
        }
    }
}