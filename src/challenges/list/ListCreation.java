package challenges.list;

import java.util.ArrayList;
import java.util.List;

public class ListCreation {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Inheritance");
        list.add("Polymorphism");
        list.add("Abstraction");
        list.add("Encapsulation");

        System.out.println("OOP Concepts:");
        for (String str : list) {
            System.out.println(str);
        }
    }

}
