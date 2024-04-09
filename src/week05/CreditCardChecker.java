package week05;

public class CreditCardChecker {
    public int decode(int digit, boolean position) {
        if (!position) { // false = odd position, return digit
//            System.out.println(digit+ ", " + position + " = " + digit);
            return digit;
        } else { // true = even position, double the digit
            int decodedDigit = digit * 2;
            if (decodedDigit < 10 ) { // if result is single digit, return digit
//                System.out.println(digit+ ", " + position + " = " + decodedDigit);
                return decodedDigit;
            } else { // if result is a double-digit, add the two digits in the number and return the sum
//                System.out.println(digit+ ", " + position + " = " + (decodedDigit - 10 + 1));
                return (decodedDigit - 10 + 1);
            }
        }
    }

    public boolean checkDigits(int num) {
        String number = String.valueOf(num);
        int sum = 0;
        int length = number.length();
        for (int i = 0; i < number.length() ; i++) {
            int digit = number.charAt(i) - '0';
//            System.out.println(digit);
            boolean position = false;
            if ((length - i) % 2 == 0) {
                position = true;
            }
            sum += decode(digit, position);
//            System.out.println(sum);
        }
//        System.out.println(sum);
        if (sum % 10 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
