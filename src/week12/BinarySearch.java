package week12;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class BinarySearch {
    public <E extends Comparable<E>> boolean binarySearch(List<E> list, E element) {
        if (list.size() == 0) {
            return false;
        }
        if (list.size() == 1) {
            return list.get(0).equals(element);
        }
        int midPoint = list.size()/2;
        int midElement = list.get(midPoint).compareTo(element);
        if (midElement == 0) {
            return true;
        }
        List<E> sublist;
        if (midElement > 0) {
            sublist = list.subList(0, midPoint);
        } else {
            sublist = list.subList(midPoint, list.size());
        }
        return binarySearch(sublist,element);
    }
    public static void main(String[] args) {
        ArrayList<Integer> listOfNum = new ArrayList<>();
        listOfNum.add(1);
        listOfNum.add(2);
        listOfNum.add(4);
        listOfNum.add(20);
        listOfNum.add(30);
        listOfNum.add(77);

        BinarySearch search = new BinarySearch();
        System.out.println(search.binarySearch(listOfNum,1));
        System.out.println(search.binarySearch(listOfNum,6));
    }
}
