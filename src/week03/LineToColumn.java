package week03;

public class LineToColumn {

    public static void lettersToLine(String line) {
        for (int i = 0; i < line.length(); i++) {
            System.out.println(line.charAt(i));
        }
    }

    public static void wordsToLine(String line) {
        String word = "";
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ' ' || i == line.length() - 1) {
                System.out.println(word);
                word = "";
            } else {
                word += line.charAt(i);
            }

        }
    }

}
