package week15;

public class DoubleRepeaterDriver {
    public static void main(String[] args) {
        final double INPUT = 256;
        final int TIMES = 3;

        // lambda expression for two times the number
        System.out.println(DoubleRepeater.repeat(x -> x * 2, INPUT, TIMES));

        // Math.sqrt via lambda
        System.out.println(DoubleRepeater.repeat(Math::sqrt, INPUT, TIMES));

        // Math.sqrt via method reference (no ->)
        System.out.println(DoubleRepeater.repeat(Math::sqrt, INPUT, TIMES));
    }
}
