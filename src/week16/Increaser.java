package week16;
/**
 * Some threads were overlapping one another,
 * so could not increase the value properly (about 20%)
 * Increasing is not atomic
 *
 * To fix the problem: add a lock to the Counter class
 * **/
public class Increaser implements Runnable {
    private Counter c;

    public Increaser(Counter counter) {
        this.c = counter;
    }

    @Override
    public void run() {
        System.out.println("Starting at " + c.getCount());
        for (int i = 0; i < 1000; i++) {
            c.increase();
        }
        System.out.println("Stopping at " + c.getCount());
    }
    public static void main(String[] args) {
        Counter counter = new Counter();
        for (int i = 0; i < 100; i++) {
            Increaser increaserTask = new Increaser(counter);
            Thread t = new Thread(increaserTask);
            t.start();
        }
    }
}
