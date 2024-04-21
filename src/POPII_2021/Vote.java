package POPII_2021;

/**
 * Question 1
 */
public class Vote {
    public static boolean yesWins( String s ) {
        int yes = 0;
        int no = 0;
        for (char c: s.toCharArray()) {
            if (c == 'y' || c == 'Y') {
                yes++;
            } else if (c == 'n' || c == 'N') {
                no++;
            }
        }
        if (yes > no) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
//        Scanner scanner = new Scanner( System.in );
        System.out.println( yesWins( "yYnN" ));
        System.out.println( yesWins( "ynynyny" ));
        System.out.println( yesWins( "uvwxyYnNabxxx" ));
    }

}
