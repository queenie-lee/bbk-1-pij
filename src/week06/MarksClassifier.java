package week06;

public class MarksClassifier {
    int distinction;
    int merit;
    int pass;
    int fail;
    int invalid;
    MarksClassifier() {
        distinction = 0;
        merit = 0;
        pass = 0;
        fail = 0;
        invalid = 0;
    }
    public void read() {
        int counter = 0;
        int num;
        do {
            java.util.Scanner scan = new java.util.Scanner(System.in);
            System.out.print("Input a mark (enter -1 to exit): ");
            num = scan.nextInt();
            if (num >= 70 && num <= 100) {
                distinction++;
            } else if (num >= 60 && num <= 69) {
                merit++;
            } else if (num >= 50 && num <= 59) {
                pass++;
            } else if (num >= 0 && num <= 49) {
                fail++;
            } else if (num == -1 ){
                counter--;
            } else {
                invalid++;
                counter--;
            }
            counter++;
        } while (num != -1);
        System.out.print("There are " + counter + " students: " + distinction + " distinctions, " + merit + " merits, " + pass + " passes, " + fail + " fails (plus " + invalid + " invalid).");

    }

}
