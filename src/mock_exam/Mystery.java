package mock_exam;

import java.util.Arrays;
import java.util.stream.Stream;

public class Mystery {
    public static int mystery(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }
        return result;
    }
    public static int mystery2(int[] numbers) {
//        if (numbers.length == 0) {
//            return 0;
//        }
//        if (numbers.length == 1) {
//            return numbers[0];
//        }
        int mysteryResult = Arrays.stream(numbers).sum();

        return mysteryResult;
    }

    public static void main(String[] args) {
        int[] numbers = {-1,-1,-1};
        System.out.println(mystery(numbers));
        System.out.println(mystery2(numbers));
    }
}
