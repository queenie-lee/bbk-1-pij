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
    public void add(Integer num) {
        if (num == null) {
            throw new NullPointerException("There is a null value in your list");
        } else if (primeTest(num)) {
            list.add((E) num);
        }
    }

    private boolean primeTest(Integer num) {
        int number = (int) num;
        if (number < 1) {
            throw new IllegalArgumentException("Number entered must be prime.");
        } else if (number == 1) {
            return true;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

//    private Map<? extends E,Integer> listCheck(List<Integer> list) {
//        Map<E,Integer> counter = new LinkedHashMap<>();
//        for (E i : list) {
//            if (!counter.containsKey(i)) {
//                counter.put(i,1);
//            } else {
//                int num = (int) counter.get(i);
//                num++;
//                counter.put(i,num);
//            }
//        }
//    }
    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("[ ");

        return super.toString();
    }
}
