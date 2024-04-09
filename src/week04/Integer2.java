package week04;

public class Integer2 {
    int value;
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isEven() {
        if (value % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isOdd() {
        if (isEven()) {
            return false;
        } else {
            return true;
        }
    }

    public void prettyPrint() {
        System.out.println(value);
    }

    public String toString() {
        String stringValue = String.valueOf(value);
        return stringValue;
    }

}
