package week05;

public class Luhn {
    public static void main(String[] args) {
        CreditCardChecker ccc = new CreditCardChecker();
        boolean even = false;
        System.out.println(ccc.decode(1, even));
        System.out.println(ccc.decode(2, even));
        System.out.println(ccc.decode(3, even));
        System.out.println(ccc.decode(4, even));
        System.out.println(ccc.decode(5, even));
        System.out.println(ccc.decode(6, even));
        System.out.println(ccc.decode(7, even));
        System.out.println(ccc.decode(8, even));
        System.out.println(ccc.decode(9, even));
        even = !even;
        System.out.println(ccc.decode(1, even));
        System.out.println(ccc.decode(2, even));
        System.out.println(ccc.decode(3, even));
        System.out.println(ccc.decode(4, even));
        System.out.println(ccc.decode(5, even));
        System.out.println(ccc.decode(6, even));
        System.out.println(ccc.decode(7, even));
        System.out.println(ccc.decode(8, even));
        System.out.println(ccc.decode(9, even));
    }
}