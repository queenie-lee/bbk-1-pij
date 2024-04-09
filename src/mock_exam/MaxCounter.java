package mock_exam;

public class MaxCounter extends Counter {
    private int maxcount;
    @Override
    public void reset() {
        super.reset();
    }

    public void setMaxcount() {
        this.maxcount = getCount();
    }
    @Override
    public String toString() {
        if (getCount() > maxcount) {
            setMaxcount();
        }
        return "the count is " + getCount() + " and the maximum was " + maxcount;
    }
}
