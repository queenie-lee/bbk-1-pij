package week12;

public class Factorial {
    public static int factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException();
        }
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(1));
        System.out.println(factorial(0));
//        System.out.println(factorial(-1));
        System.out.println(factorial(6));
    }
}
