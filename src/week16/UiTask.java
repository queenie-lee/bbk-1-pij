package week16;


import java.util.ArrayList;

public class UiTask extends Thread {
    private int taskId;
    private int sleepDurationMs;
    private ArrayList<Integer> finishedTasks;

    public UiTask(int taskId, int sleepDurationMS, ArrayList<Integer> finishedTasks) {
        this.taskId = taskId;
        this.sleepDurationMs = sleepDurationMS;
        this.finishedTasks = finishedTasks;
    }

    public void run() {
        try{
            Thread.sleep(sleepDurationMs);
        } catch (InterruptedException e) {}
        finally { // runs after the try finishes
            finishedTasks.add(taskId);
        }

    }
}
