package POPII_2020;

/**
 * Question 2
 */
public class InsertSpaces {
    public static String insertSpaces( String s ) {
        StringBuilder spacedWord = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            spacedWord.append(s.charAt(i));
            spacedWord.append(" ");
        }
//        spacedWord.deleteCharAt(s.length());
        return spacedWord.toString().trim();
    }
    public static void main(String[] args) {
//        Scanner scanner = new Scanner( System.in );
        String w = "World";
        String w2 = insertSpaces( w );
        System.out.println( w2 );
        System.out.println( w2.length());
    }
}
