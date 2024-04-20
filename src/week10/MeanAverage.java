package week10;

import java.util.InputMismatchException;

public class MeanAverage {
    public static void userInput() {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int mean = 0;
        int counter = 0;
        int max;
        String inputNumbers = "";
        do {
            System.out.print("Enter the number of numbers you wish to enter: ");
            inputNumbers = scan.nextLine();
        } while (!testForInt(inputNumbers));

        max = Integer.parseInt(inputNumbers);

        do {
            System.out.print("Enter a number: ");
            String input = scan.nextLine();
            if (testForInt(input)) {
                int num = Integer.parseInt(input);
                mean += num;
                counter++;
            }
        } while (counter < max);
        Double meanAvg = (double) mean / max;
        System.out.println("The mean average is " + meanAvg);;
    }

    public static boolean testForInt(String input) {
        try {
            int num = Integer.parseInt(input);
            return true;
        } catch (NumberFormatException ex) {
            System.out.println("You did not enter a number.");
            return false;
        }
    }
    public static void main(String[] args) {
        userInput();
    }
}
