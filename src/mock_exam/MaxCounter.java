package mock_exam;

public class MaxCounter extends Counter{
    private int maxCount = 0;
    @Override
    public void reset() {
        super.reset();
    }
    @Override
    public void click() {
        super.click();
    }
    public int getMaxCount() {
        if (super.getCount() > maxCount) {
            maxCount = super.getCount();
        }
        return maxCount;
    }
    @Override
    public String toString() {
        return super.toString() + " and the maximum was " + getMaxCount();
    }
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
