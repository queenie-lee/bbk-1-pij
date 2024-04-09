package week04;

public class BinaryDecimal {
    public static int power(int x, int y) {
        // Takes a base b and an exponent e from the user, and returns the result of b^e
        int result = 1;
        for (int i = 0; i < y ; i++) {
            result *= x;
        }
        return result;
    }

    public static int power2(int y) {
        return power(2,y);
    }

    public static int binary2decimal(String x) {
        int decimal = 0;
        int exp = x.length() - 1;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == '1') {
                decimal += power2(exp - i);
            }
        }
        return decimal;
    }

    public static String decimal2binary(int x) {
        StringBuilder binary = new StringBuilder();
        int i = 0;
        int remainder;
        while (x > 0) {
            remainder = x % 2;
            if (remainder == 1) {
                binary.append(1);
            } else {
                binary.append(0);
            }
            x = x / 2;
        }
        return binary.toString();
    }
}
