package week01;

public class PrimeNumbersHelper {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.print("Enter a number:");
        int num = scan.nextInt();
        PrimeNumbers prime = new PrimeNumbers(num);
        if (prime.primeCheck() == true) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

    }
}
