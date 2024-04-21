package POPII_2020;

/**
 * Question 1
 */
public class SumEven {

    public static int sumEven( int b, int c ) {
        if (c < b) {
            int d = b;
            b = c;
            c = d;

        }
        int sum = 0;
        for (int i = b; i < c + 1; i++) {
            if (i % 2 == 0) {
                sum += i;
            }

        } return sum;
    }
    public static void main(String[] args) {
//        Scanner scanner = new Scanner( System.in );
        System.out.println( sumEven(-3, 8 ));
        System.out.println( sumEven( 8, -3 ));
    }
}
