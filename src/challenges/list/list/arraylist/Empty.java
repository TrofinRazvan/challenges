package challenges.list.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Empty {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("I");
        arrayList.add("You");
        arrayList.add("He");

        int size = arrayList.size();
        System.out.println("ArrayList has: " + arrayList + " with " + size + " elements.");

        arrayList.clear();
        int sizeNew = arrayList.size();
        System.out.println("ArrayList consists of " + sizeNew + " elements.");

        // Manually remove each element
//        Iterator<String> i = arrayList.iterator();
//        while (i.hasNext()) {
//            i.next();
//            i.remove();
//        }
    }
}