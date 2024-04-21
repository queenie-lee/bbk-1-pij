package POPII_2019;

import java.util.ArrayList;

/**
 * Question 3
 */
public class Duplicate {
    public static <T> void duplicate( ArrayList<T> list ) {
        for (int i = list.size() - 1 ; i > -1 ; i--) {
            list.add(i,list.get(i));
        }
        StringBuilder duplicatedList = new StringBuilder();
        for (T i : list) {
            duplicatedList.append(i);
        }
        System.out.println(duplicatedList);
    }
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(1);
        numList.add(2);
        numList.add(3);
        numList.add(4);
        numList.add(5);
        numList.add(1);
        duplicate(numList);
//        Scanner scanner = new Scanner( System.in );
    }
}
