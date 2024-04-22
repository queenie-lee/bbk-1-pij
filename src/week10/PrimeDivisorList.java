package week10;

import java.util.*;

/**
 * Not finished
 */
public class PrimeDivisorList<E> {
    List<E> list;

    PrimeDivisorList() {
        list = new ArrayList<>();
    }
    public void add(E num) {
        if (num == null) {
            throw new NullPointerException("There is a null value in your list");
        } else if (primeTest(num)) {
            list.add((E) num);
        }
    }

    private boolean primeTest(E num) {
        int number = (int) num;
        if (number < 1) {
            throw new IllegalArgumentException("Number entered must be prime.");
        } else if (number == 1) {
            return true;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    throw new IllegalArgumentException("Number entered must be prime.");
                }
            }
            return true;
        }
    }

    @Override
    public String toString() {
        Map<E,Integer> frequency = new HashMap<>();
        for (E i : list) {
            if (frequency.containsKey(i)) {
                frequency.replace(i,frequency.get(i) +1);
            } else {
                frequency.put(i,1);
            }
        }
        int calculation = 1;
        StringBuilder string = new StringBuilder();
        string.append("[ ");
        for (E i : frequency.keySet()) {
            int value = frequency.get(i);
            if (value == 1) {
                string.append(i);
                string.append(" * ");
                calculation *= (int) i;
            } else {
                string.append(i);
                string.append("^");
                string.append(value);
                string.append(" * ");
                int initialCal = (int) Math.pow((int) i, value);
                calculation *= initialCal;
            }
        }
        string.deleteCharAt(string.length() - 1);
        string.append(" = ");
        string.append(calculation);
        string.append(" ]");
        return string.toString();
    }

    public static void main(String[] args) {
        PrimeDivisorList<Integer> primeList = new PrimeDivisorList<>();
//        primeList.add(2);
//        primeList.add(3);
//        primeList.add(5);
//        primeList.add(5);
//        primeList.add(2);
//        primeList.add(7);
        primeList.add(2);
        primeList.add(3);
        primeList.add(3);
        primeList.add(7);
        System.out.println(primeList.toString());
    }
}
