package week12;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public static <E extends Comparable<? super E>> List<E> quicksort(List<E> sortMe) {
        if (sortMe.isEmpty() || sortMe.size() == 1) {
            return sortMe;
        }
        E pivot = sortMe.get(0);
        List<E> smaller = new ArrayList<>();
        List<E> larger = new ArrayList<>();
        List<E> equals = new ArrayList<>();
        for (E item : sortMe) {
            int comparison = item.compareTo(pivot);
             if (comparison < 0) { // item is less than the pivot number
                smaller.add(item);
            } else if (comparison > 0) {
                larger.add(item);
            } else {
                 equals.add(item);
             }
        }
        smaller = quicksort(smaller);
        larger = quicksort(larger);
        ArrayList<E>mergedList = new ArrayList<>();
        mergedList.addAll(smaller);
//        mergedList.add(pivot);
        mergedList.addAll(equals);
        mergedList.addAll(larger);
        return mergedList;
    }
    public static void main(String[] args) {
        List<Integer> list = List.of(3,7,2,9,1,1,2,3);
        System.out.println(quicksort(list));
    }
}
