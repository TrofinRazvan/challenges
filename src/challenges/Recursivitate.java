package challenges;

public class Recursivitate {

    public static void main(String[] args) {
        System.out.println(isPalindrome("ever been"));
    }
//    Time complexity - O(n)
    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return true;
        }
        char first = str.charAt(0);
        char last = str.charAt(str.length() - 1);
        if (first != last) {
            return false;
        }
        return isPalindrome(str.substring(1, str.length() - 1));
    }
}