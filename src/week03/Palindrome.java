package week03;

public class Palindrome {
    public static boolean detector(String sequence) {
        int end = sequence.length() - 1;
        boolean detect = true;
        for (int i = 0; i < sequence.length(); i++) {
            if (sequence.charAt(i) != sequence.charAt(end - i)) {
                System.out.println("The sequence is not a palindrome.");
                return false;
            }
        }
        System.out.println("The sequence is a palindrome.");
        return true;
    }

    public static void creator (String sequence) {
        StringBuilder palindrome = new StringBuilder();
        palindrome.append(sequence);
        for (int i = sequence.length() - 1; i >= 0 ; i--) {
            palindrome.append(sequence.charAt(i));
        }
        System.out.println(palindrome.toString());
    }
}
