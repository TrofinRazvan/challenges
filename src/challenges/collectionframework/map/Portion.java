package challenges.collectionframework.map;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Portion {

    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Leona");
        treeMap.put(2, "Leona");
        treeMap.put(3, "Leona");
        treeMap.put(4, "who");

        int key = 2;

        SortedMap<Integer, String> portion = treeMap.headMap(key);

        System.out.println("Portion of the map whose keys are strictly less than " + key + ":");
        for (Map.Entry<Integer, String> entry : portion.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}