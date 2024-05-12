package challenges.collectionframework.set;

import java.util.HashSet;
import java.util.TreeSet;

public class Get {

    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(32);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(5);
        hashSet.add(31);
        hashSet.add(9);

        int num = hashSet.size();
        System.out.println(num);
    }
}