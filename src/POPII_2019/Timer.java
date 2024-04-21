package POPII_2019;

public class Timer implements Runnable{
    /**
     * When an object implementing interface {@code Runnable} is used
     * to create a thread, starting the thread causes the object's
     * {@code run} method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method {@code run} is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */

    private long durationInSeconds;
    private boolean running;

    public Timer() {
        running = false;
    }

    public synchronized void attemptToSet(long durationInSeconds) {
        if (running) {
            System.out.println("Timer still running!");
        }
        this.durationInSeconds = durationInSeconds;
        this.running = true;
        new Thread(this).start();
     }

    @Override
    public void run() {
        try {
            Thread.sleep(durationInSeconds * 1000);
            System.out.println("Timer is done!");
            running = false;
        } catch (InterruptedException ignored) {
        }
    }
}
