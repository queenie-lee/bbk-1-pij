package POPII_2020;

/**
 * Question 5
 */
public class Time {
    private int hour;
    private int minute;
    private int second;
    Time ( int h, int m, int s ) {
        hour = h;
        minute = m;
        second = s;
    }
    Time ( Time t, int secs ) {
        int calc = t.getSecond() + secs;
        second = calc % 60;
        calc = t.getMinute() + (calc / 60);
        minute = calc % 60;
        calc = t.getHour() + (calc / 60);
        if (calc > 23) {
            calc -= 24;
        }
        hour = calc;
    }
    private int getHour() {
        return hour;
    }
    private int getMinute() {
        return minute;
    }
    private int getSecond() {
        return second;
    }

    public String toString() {
        StringBuilder timePrint = new StringBuilder();
        if (hour < 10) {
            timePrint.append(0);
        }
        timePrint.append(hour);
        timePrint.append(":");
        if (minute < 10) {
            timePrint.append(0);
        }
        timePrint.append(minute);
        timePrint.append(":");
        if (second < 10) {
            timePrint.append(0);
        }
        timePrint.append(second);
        return timePrint.toString();
    }
    public static void main(String[] args) {
//        Scanner scanner = new Scanner( System.in );
        Time a = new Time( 23, 59, 4 );
        System.out.println( a );
        Time b = new Time( a, 57 );
        System.out.println( b );
        Time c = new Time( b, 3660 );
        System.out.println( c );
    }
}
