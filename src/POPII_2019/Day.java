package POPII_2019;

/**
 * Question 1
 */
public class Day {
    enum DAYS {
        Mon, Tue, Wed, Thu, Fri, Sat, Sun
    }
    static int dayFirst (String dayOfFirst) {
        switch (dayOfFirst)  {
            case "Mon" :
                return 1;
            case "Tue" :
                return 2;
            case "Wed" :
                return 3;
            case "Thu" :
                return 4;
            case "Fri" :
                return 5;
            case "Sat" :
                return 6;
            case "Sun" :
                return 7;
        }
        return 0;
    }

    static String week (int num) {
        return switch (num) {
            case 1 -> "Mon";
            case 2 -> "Tue";
            case 3 -> "Wed";
            case 4 -> "Thu";
            case 5 -> "Fri";
            case 6 -> "Sat";
            case 7 -> "Sun";
            default -> "Sun";
        };
    }
    public static String dayOfWeek( int dayInMonth, String dayOfFirst ) {
        int dayNum = dayInMonth % 7;
        dayNum = (dayFirst(dayOfFirst) - 1 + dayNum) % 7;
        return week(dayNum);
    }
    public static void main(String[] args) {
//        Scanner scanner = new Scanner( System.in );
        System.out.println( dayOfWeek( 1, "Sun") );
        System.out.println( dayOfWeek( 2, "Sun") );
        System.out.println( dayOfWeek( 3, "Sun") );
        System.out.println( dayOfWeek( 8, "Sat") );
    }
}
