package PIJ_2023;

public class Mystery {
    public static String mysteryOfBirkbeck2023(int x, String s) {
        if (x < -1) {
            throw new IllegalArgumentException();
        }
        if (x == -1) {
            return "";
        }
        String smaller = mysteryOfBirkbeck2023(x - 1, s);
        return smaller + s.charAt(x % s.length());
    }
    public static String m(int x, String s) {
        if (x < -1) {
            throw new IllegalArgumentException();
        } else if (x == -1) {
            return "";
        } else if (x > s.length()) {
            StringBuilder mysteryWord = new StringBuilder();
            for (int i = 0; i < (x/s.length()); i++) {
                mysteryWord.append(s);
            }
            mysteryWord.append(s.substring(0,((x % s.length())+1)));
            return mysteryWord.toString();

        } else {
            return s.substring(0, x + 1);
        }
    }

    public static void main(String[] args) {
        int num = 3;
        String word = "Mystery";
        System.out.println(mysteryOfBirkbeck2023(num,word));
        System.out.println(m(num,word));
    }
}
