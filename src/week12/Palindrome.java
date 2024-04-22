package week12;

public class Palindrome {
    public static boolean palindromeCheck(String input) {
        if (input.length() == 0) {
            return false;
        }
        if (input.length() == 1) {
            return true;
        }
        if (input.length() == 2 && (input.charAt(0) == input.charAt(input.length()-1))) {
            return true;
        }
        if (input.charAt(0) != input.charAt(input.length()-1)) {
            return false;
        }
        return palindromeCheck(input.substring(1,input.length()-1));
    }
    public static void main(String[] args) {
        System.out.println(palindromeCheck("ABBBABBBA"));
        System.out.println(palindromeCheck("lksdf"));
    }
}
