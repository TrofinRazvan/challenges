package challenges.collectionframework.map;
//Write a Java program to get a key-value mapping associated with the greatest key strictly less than the given key. Return null if there is no such key.

import java.util.Map;
import java.util.TreeMap;

public class TreeMapKeyFinder {

    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "2");
        treeMap.put(43, "2");
        treeMap.put(2, "2");
        treeMap.put(6, "2");
        treeMap.put(32, "");

        int givenKey = 6;

        Integer lesserKey = null;
        String value = null;

        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            if (entry.getKey() < givenKey && (lesserKey == null || entry.getKey() > lesserKey)) {
                lesserKey = entry.getKey();
                value = entry.getValue();
            }
        }
        if (lesserKey != null) {
            value = treeMap.get(lesserKey);
        }
        if (value != null) {
            System.out.println("Key strictly less than " + givenKey + ": " + lesserKey + " with value " + value);
        } else {
            System.out.println("There is no key strictly less than " + givenKey);
        }
    }
}