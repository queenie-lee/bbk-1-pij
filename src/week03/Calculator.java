package week03;

public class Calculator {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        Double result = null;
        String number;
        System.out.print("Enter a number: ");
        number = scan.nextLine();
        Double num1 = Double.parseDouble(number);
        System.out.print("Enter a second number: ");
        number = scan.nextLine();
        Double num2 = Double.parseDouble(number);
        System.out.println("Choose from one of the following options: ");
        System.out.println("1: Addition\n" +
                "2: Subtraction\n" +
                "3: Multiplication\n" +
                "4: Division");

        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                result = num1 / num2;
                break;
        }

        System.out.println("Result is:" + result);




    }
}
