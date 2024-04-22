package week12;

public class Power {
    public static long pow (int base, int exp) {
        if (exp < 0) {
            throw new IllegalArgumentException();
        }
        if (exp == 1) {
            return base;
        }
        return base * pow(base, (exp - 1));
    }
    public static void main(String[] args) {
        System.out.println(pow(2,3));
        System.out.println(pow(2,5));
    }
}
