package POPII_2021;

import java.util.function.*;
public class RPS {
    public static BinaryOperator<String> beats() {
        BinaryOperator <String> rockPaperScissors = (input1, input2) -> {
            String rock = "rock";
            String paper = "paper";
            String scissors = "scissors";
            if (input1.equals(input2)) {
                return input1;
            } else if ((input1.equals(rock) && input2.equals(paper)) ||
                    ((input1.equals(paper)) && input2.equals(rock))) {
                return paper;
            } else if ((input1.equals(paper) && input2.equals(scissors)) ||
                    ((input1.equals(scissors)) && input2.equals(paper))) {
                return scissors;
            } else if ((input1.equals(scissors) && input2.equals(rock)) ||
                    ((input1.equals(rock)) && input2.equals(scissors))) {
                return rock;
            } else {
                return input1;
            }
        };
        return rockPaperScissors;
    }

    public static void main(String[] args) {
        System.out.println( beats().apply("rock", "paper" ));
        System.out.println( beats().apply("Joe", "paper" ));
        System.out.println( beats().apply("paper", "paper" ));
    }


}
