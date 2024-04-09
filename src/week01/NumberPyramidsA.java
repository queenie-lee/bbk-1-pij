package week01;

public class NumberPyramidsA {
    public static void main(String[] args) {
        int i = 1;
        while (true) {
            String line = "";
            for (int j = 0; j < i ; j ++) {
                line += i;
            }
            System.out.println(line);
            line = "" ;
            i += 1;
        }
    }
}
