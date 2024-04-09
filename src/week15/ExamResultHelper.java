package week15;

import java.util.ArrayList;
import java.util.List;

public class ExamResultHelper {
    public static int getRandom(int max) {
        return (int) (Math.round(Math.random() * max));
    }
    public static List<ExamResult> makeLargeTestData() {
        final int SIZE = 100000000;
        final int MAX_MARK = 100;
        final int MAX_NAME_SUFFIX = 400;
        final String NAME_PREFIX = "Student";
        final String MODULE = "PiJ";
        List<ExamResult> result = new ArrayList<>();
        for (int i = 0; i < SIZE; i++) {
            int randomMark = getRandom(MAX_MARK);
            int randomSuffix = getRandom(MAX_NAME_SUFFIX);
            ExamResult examResult = new ExamResult(NAME_PREFIX + randomSuffix,
                    MODULE, randomMark);
            result.add(examResult);
        }
        return result;
    }

    public static List<ExamResult> makeTestData() {
        return List.of(
                new ExamResult("Harry", "FoC", 46), // fail
                new ExamResult("Sally", "FoC", 82), // distinction
                new ExamResult("Sally", "PiJ", 76), // distinction
                new ExamResult("Alice", "PiJ", 80), // distinction
                new ExamResult("Bob", "PiJ", 68), // merit
                new ExamResult("Bob", "FoC", 58) // pass
        );
    }
}
