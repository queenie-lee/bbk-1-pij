package POPII_2020;

public class toggleCaps {
    public static String toggleCaps( String s ) {
        StringBuilder result = new StringBuilder();
        char[] chars = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char currentCharacter = s.charAt(i);
            if (Character.isLetter(currentCharacter) && (i == 0 || !Character.isLetter(s.charAt(i - 1)))) {
                if (Character.isUpperCase(currentCharacter)) {
                    currentCharacter = Character.toLowerCase(currentCharacter);
                } else {
                    currentCharacter = Character.toUpperCase(currentCharacter);
                }
            }
            result.append(currentCharacter);
        }
        return result.toString();
    }
    public static void main(String[] args) {
//        Scanner scanner = new Scanner( System.in );
//        String t = toggleCaps( "this is A Test.");
//        String t = toggleCaps( "((((this is A Test.");
//        String t = toggleCaps( "this is^*$(%*A Test.");
        System.out.println( toggleCaps( "this is A Test."));
        System.out.println( toggleCaps( "((((this is A Test."));
        System.out.println( toggleCaps( "this is^*$(%*A Test."));
    }
}
