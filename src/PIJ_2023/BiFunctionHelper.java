package PIJ_2023;

public class BiFunctionHelper {
    public static void main(String[] args) {
        BiFunction<String, Integer, String[]> bf = (input1, input2) -> {
            if (input2 == null || input2 < 0) {
                throw new IllegalArgumentException();
            } else {
                String[] array = new String[input2];
                for (int i = 0; i < input2; i++) {
                    array[i] = input1;
                }
                return array;
            }

        };
        System.out.println(java.util.Arrays.toString(bf.apply("PiJ",3 )));
    }

}
