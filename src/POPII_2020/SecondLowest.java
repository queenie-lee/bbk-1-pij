package POPII_2020;

import java.util.*;

/**
 * (Second-to-lowest of the second-to-lowest.) Write a method
 * public static int secondLowest( int[] a )
 * that, given an array of ints, returns a member of the array, as follows. (It can be assumed
 * that the method will only be invoked on arrays having at least one member.)
 */
public class SecondLowest {
    public static int secondLowest( int[] a ) {
//        int[] frequency = new int[a.length];
//        for (int i = 0; i < a.length; i++) {
//            if ()
//        }
        Map<Integer,Integer> frequencyMap = new HashMap<>();
        // getOrDefault can do the same as below in one single line
        // frequencyMap.put(i, frequencyMap.getOrDefault(i,0) +1 );
        for (Integer i : a) {
            if (frequencyMap.get(i) == null) {
                frequencyMap.put(i,1);

            } else {
                int add = frequencyMap.get(i);
                add++;
                frequencyMap.replace(i,add);
            }
        }

        // using streams to find the second lowest
//        int frequencyOfInterest = frequencyMap
//                .values()
//                .stream()
//                .distinct()
//                .sorted()
//                .skip(1)
//                .findFirst()
//                .orElse(Collections.min(frequencyMap.values()));

        SortedSet<Integer> frequencyOrder = new TreeSet<>(frequencyMap.values());
        if (frequencyOrder.size() > 1) {
            frequencyOrder.remove(frequencyOrder.first());
        }
        int secondLowestFrequency = frequencyOrder.first();

        SortedSet<Integer> secondLowestNum = new TreeSet<>();
        frequencyMap.forEach((k, v) -> {
            if (v == secondLowestFrequency) {
                secondLowestNum.add(k);
            }
        });

        if (secondLowestNum.size() > 1) {
            secondLowestNum.remove(secondLowestNum.first());
        }
        return secondLowestNum.first();

    }

    public static void main(String[] args) {
        int b[] = { 4, 3, 1, 1, 2 };
        System.out.println( secondLowest( b ));
        int c[] = { 4, 3, 1, 1, 2, 2 };
        System.out.println( secondLowest( c ));
        int d[] = { 4, 3, 1, 2 };
        System.out.println( secondLowest( d ));
    }
}
