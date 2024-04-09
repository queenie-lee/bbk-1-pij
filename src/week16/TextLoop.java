package week16;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

import static java.util.concurrent.Executors.newCachedThreadPool;

/**
* To toggle between Mode 1 and Mode 2:
 * Run > Edit Configurations > Toggle between 0 and 1 in Program Arguments > Apply and OK/Run
* */
public class TextLoop implements Runnable {
    public static final int COUNT = 10;
    public static final String MODE0 = "0";
    public static final String MODE1 = "1";

    private final String name;

    public TextLoop(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < COUNT; i++) {
            System.out.println("Loop: " + name + ", iteration: " + i + ".");
        }
    }

    public static void main(String args[]) {
        String localVar = "1";
        /* * Originally used Executor
        * Modified to use ExecutorService (it implements Executor), as it has the Shutdown method
         * ExecutorService should typically be used over Executor,
         * unless a particular method/class calls only for Executor
         * */

        ExecutorService e = newCachedThreadPool();
        if (args.length < 1 || (!args[0].equals(MODE0) && !args[0].equals(MODE1))) {
            System.out.println("USAGE: java TextLoop <mode>");
            System.out.println("     mode " + MODE0 + ": without threads");
            System.out.println("     mode " + MODE1 + ": with threads");
        } else if (localVar.equals(MODE0)) {
            for (int i = 0; i < 10; i++) {
                Runnable r = new TextLoop("Thread " + i);
                r.run();
            }
        } else {
            for (int i = 0; i < 10; i++) {
                Runnable r = new TextLoop("Thread " + i);
                e.execute(r);
//                Thread t = new Thread(r);
//                t.start();
            }
            e.shutdown();
        }
    }
}
