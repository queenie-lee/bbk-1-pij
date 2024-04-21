package PIJ_2023;

public class BirkbeckGreeter implements Runnable {
    private String text;
    public BirkbeckGreeter(String text) {
        this.text = text;
    }
    @Override
    public void run() {
        System.out.println(this.text);
    }

    public static void main(String[] args) {
//        Runnable hello = new BirkbeckGreeter("Hello");
//        Runnable world = new BirkbeckGreeter("World");
//        hello.run();
//        world.run();

        Runnable first = new BirkbeckGreeter("First");
        Runnable second = new BirkbeckGreeter("Second");
        Thread t1 = new Thread(first);
        Thread t2 = new Thread(second);
        t1.start();
        t2.start();
    }
}
