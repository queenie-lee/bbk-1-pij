package mock_exam;

import PIJ_2023.BiFunction;

import java.util.Comparator;

public class ComparatorString {

    public static int cmp2 (String input1, String input2) {
        int comparison;
        if (input1 == null && input2 == null) {
            return 0;
        } else if (input1 == null) {
            return -1;
        } else if (input2 == null ){
            return 1;
        } else {
            if (input1.length() == input2.length()) {
                comparison = input1.compareTo(input2);
            } else {
                if (input1.length() > input2.length()) {
                    comparison = 1;
                } else {
                    comparison = -1;
                }
            }

        }
        return comparison;
    }

    public static void main(String[] args) {
        Comparator<String> cmp = (input1,input2) -> {
            return cmp2(input1,input2);
//            int comparison;
//            if (input1 == null && input2 == null) {
//                return 0;
//            } else if (input1 == null) {
//                return -1;
//            } else if (input2 == null ){
//                return 1;
//            } else {
//                if (input1.length() == input2.length()) {
//                    comparison = input1.compareTo(input2);
//                } else {
//                    if (input1.length() > input2.length()) {
//                        comparison = 1;
//                    } else {
//                        comparison = -1;
//                    }
//                }
//
//            }
//            return comparison;
        };

        System.out.println(cmp.compare("bb", null) > 0);
        System.out.println(cmp.compare("bb", "a") > 0);
        System.out.println(cmp.compare("bb", "aa") > 0);
        System.out.println(cmp.compare("bb", "bb") == 0);
        System.out.println(cmp.compare(null, null) == 0);
        System.out.println(cmp.compare("bb", "aaa") < 0);
        System.out.println(cmp.compare("bb", "ccc") < 0);
        System.out.println(cmp.compare(null, "") < 0);


    }
}
