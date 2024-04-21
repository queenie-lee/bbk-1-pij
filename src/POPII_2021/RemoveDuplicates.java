package POPII_2021;

import java.util.*;

/**
 * Question 2
 * Going backwards,
 * Iterate through, if it appears again, remove it.
 * Reverse iterator -- reverse for each
 * Choose a type of set to store the found letters
 */
public class RemoveDuplicates {
    public static <T> void remove( ArrayList<T> list ) {
        Set<T> checkedItems = new TreeSet<>();
        for (int i = list.size() - 1 ; i > -1 ; i--) {
            T key = list.get(i);
            if (checkedItems.contains(key)) {
                list.remove(i);
            } else {
                checkedItems.add(key);
            }
        }

        }
//        Map<T,String> appearanceMap = new HashMap<>();
//        for (int i = 0; i < list.size(); i++) {
//            T key = list.get(i);
//            if (appearanceMap.containsKey(key)) {
//                StringBuilder appearance = new StringBuilder();
//                appearance.append(appearanceMap.get(key));
//                appearance.append(i);
//                appearanceMap.replace(key, appearance.toString());
//            } else {
//                appearanceMap.put(key,Integer.toString(i));
//            }
//        }
//        ArrayList<String> appearance = new ArrayList<>(appearanceMap.values());
//        for (String i: appearance) {
//            if (i.length() > 1) {
//                StringBuilder letterAppearance = new StringBuilder();
//                letterAppearance.append(i);
//                letterAppearance.deleteCharAt(letterAppearance.length()-1);
//                int objAppearancesInList = letterAppearance.length();
//                for (int j = objAppearancesInList - 1; j > -1; j--) {
//                    list.remove(Character.getNumericValue(letterAppearance.charAt(j)));
//                }
//            }
//        }
//    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner( System.in );
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("A");
        list1.add("B");
        list1.add("A");
        System.out.println( list1 );
        remove( list1 );
        System.out.println( list1 );
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("A"); list2.add( "X" ); list2.add("A");
        list2.add("B");
        list2.add("A"); list2.add("A");
        list2.add("C");
        list2.add("B");
        System.out.println( list2 );
        remove( list2 );
        System.out.println( list2 );
    }
}
