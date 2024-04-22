package mock_exam_attempt1;

public class Counter {
    private int count;
    public void reset() {
        count = 0;
    }
    public void click() {
        count++;
    }
    public int getCount() {
        return count;
    }
    public String toString() {
        return "the count is " + count;
    }
}
