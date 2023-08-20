package challenges.javabasics;

public class DivisionByZero {

    public static void main(String[] args) {

        getNumbers(100,0);
    }

    public static void getNumbers(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("An ArithmeticException occurred: " + e.getMessage());
        }
    }
}