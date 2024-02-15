package challenges.list.list.arraylist;
//Write a Java program to test an array list is empty or not.

public class Test {

    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(has(arr));
    }

    public static boolean has(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                return true;
            }
        }
        return false;
    }
}