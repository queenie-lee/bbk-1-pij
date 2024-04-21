package POPII_2019;

import java.util.Scanner;

public class TimerMain {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        Timer timer = new Timer();
        while (true) {
            long duration = in.nextLong();
            timer.attemptToSet(duration);
        }
    }
}
