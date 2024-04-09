package week16;

public class TextLoopSleep1 implements Runnable {
    public static final int COUNT = 10;
    public static final String MODE0 = "0";
    public static final String MODE1 = "1";

    private final String name;

    public TextLoopSleep1(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < COUNT; i++) {
            sleep();
        }
    }

    private void sleep() {
        try {
            Thread.sleep(1000); // Sleep one second
        } catch (InterruptedException ex) {
            ex.printStackTrace(); // Nothing to do, sleep a bit less
            // alternative approach: throw new RuntimeException(ex);
        }
    }

    public static void main(String args[]) {
        if (args.length < 1 || (!args[0].equals(MODE0) && !args[0].equals(MODE1))) {
            System.out.println("USAGE: java TextLoop <mode>");
            System.out.println("     mode " + MODE0 + ": without threads");
            System.out.println("     mode " + MODE1 + ": with threads");
        } else if (args[0].equals(MODE0)) {
            for (int i = 0; i < 10; i++) {
                Runnable r = new TextLoopSleep1("Thread " + i);
                r.run();
            }
        } else {
            for (int i = 0; i < 10; i++) {
                Runnable r = new TextLoopSleep1("Thread " + i);
                Thread t = new Thread(r);
                t.start();
            }
        }
    }
}
