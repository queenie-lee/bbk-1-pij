package mock_exam_attempt1;

public class CounterHelper {
    public static void main(String[] args) {
        MaxCounter mc = new MaxCounter();
        System.out.println(mc);
        mc.click();
        mc.click();
        System.out.println(mc);
        mc.reset();
        System.out.println(mc);
        mc.click();
        System.out.println(mc);
        mc.click();
        mc.click();
        System.out.println(mc);
    }
}
