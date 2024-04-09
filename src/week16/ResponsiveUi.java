package week16;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ResponsiveUi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> finishedTasks = new ArrayList<>();
        ArrayList<Thread> openThreads = new ArrayList<>();

        for (int i = 0; i < 10 ; i++) {
            System.out.println("Enter the duration (in ms) of task " + i + ": ");
            int duration = scanner.nextInt();

            UiTask uiTask = new UiTask(i, duration, finishedTasks);
            openThreads.add(uiTask);
            uiTask.start();

            displayFinishedTasks(finishedTasks);
        }

        for(Thread thread : openThreads) {
            try {
                thread.join(); // join waits the execution to finish
            } catch (InterruptedException e) {}
            displayFinishedTasks(finishedTasks);
        }
    }


    private static void displayFinishedTasks(ArrayList<Integer> finishedTasks) {
        if (!finishedTasks.isEmpty()) {
            System.out.println("Finished tasks " + finishedTasks);
            finishedTasks.clear();
        }
    }
}
