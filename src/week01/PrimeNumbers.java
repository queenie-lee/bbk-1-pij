package week01;

public class PrimeNumbers {
    int num;

    PrimeNumbers(int num) {
        this.num = num;
    }
    public boolean primeCheck() {
        if (num <= 0) {
            return false;
        } else {
            for (int i = 2; i < num ; i ++ ) {
                if (num % i == 0) {
                    return false;
                }
            } return true;
        }
    }


}
