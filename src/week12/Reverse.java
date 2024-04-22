package week12;

public class Reverse {
    public String reverse(String input) {
        if (input.isEmpty()) {
            throw new IllegalArgumentException();
        }
        if (input.length() == 1) {
            return input;
        }
        String reversedInput = reverse(input.substring(1));
        return reversedInput + input.charAt(0);
    }
    public static String reverse2(String input) {
        if (input.isEmpty()) {
            throw new IllegalArgumentException();
        }
        return reverse2(input,0);
    }

    private static String reverse2(String input, int nextPos) {
        if (input.length() == 1) {
            return input;
        }
        if (nextPos == input.length()) {
            return "";
        }
        return reverse2(input, nextPos + 1) + input;
    }
    public static void main(String[] args) {
        Reverse string = new Reverse();
        System.out.println(string.reverse("ABCD"));
//        System.out.println(reverse2("ABCD"));
    }
}
