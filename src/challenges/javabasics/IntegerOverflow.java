package challenges.javabasics;

public class IntegerOverflow {

    public static void main(String[] args) {

        int a = 2147483647;
        int b = 223454543;
        long result = (long) a * b;
        System.out.println("Result is: " + result);
    }
}
