package challenges.javabasics;

public class StringToInteger {

    public static void main(String[] args) {
        String string = "1vdf";
        try {
            int num = Integer.parseInt(string);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format!");
        }
    }
}