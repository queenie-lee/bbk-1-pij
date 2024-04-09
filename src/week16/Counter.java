package week16;

public class Counter {
    private int n;

    public synchronized void increase() {
        n++;
    }

    public int getCount() {
        return n;
    }
}
