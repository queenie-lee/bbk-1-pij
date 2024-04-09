package week05;

public class Luhn2 {
    public static void main(String[] args) {
        CreditCardChecker ccc = new CreditCardChecker();
        int num = 2315778;
        System.out.println("CC number " + num + " is valid: " + ccc.checkDigits(num));
        num = 1234567;
        System.out.println("CC number " + num + " is valid: " + ccc.checkDigits(num));
        num = 7654321;
        System.out.println("CC number " + num + " is valid: " + ccc.checkDigits(num));
        num = 1111111;
        System.out.println("CC number " + num + " is valid: " + ccc.checkDigits(num));
        }
}
