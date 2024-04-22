package mock_exam;

import java.util.ArrayList;
import java.util.List;

public class ExtractNumbers {
    public static List<Number> extractNumbers(List<?> data) {
        if (data == null) {
            throw new IllegalArgumentException();
        }
        ArrayList<Number> newList = new ArrayList<>();
        for (Object item : data) {
            try {
                if (item instanceof Number) {
                    newList.add((Number)item);
                }
            } catch (IllegalArgumentException ignored){};
        }
        return newList;
    }

    public static void main(String[] args) {

    }
}
