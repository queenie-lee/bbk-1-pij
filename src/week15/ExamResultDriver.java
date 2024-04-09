package week15;

import java.util.Collection;
import java.util.List;


public class ExamResultDriver {

    public static void runLarge(boolean parallel) {
        List<ExamResult> largeTestData = ExamResultHelper.makeLargeTestData();
        long startTime = System.nanoTime();
        // use System.nanoTime() to measure time before and after the
        // method call, then compare
        List<String> results;
        if (parallel) {
            results = ExamResultUtils.getStudentsParallel(largeTestData);
        } else {
            results = ExamResultUtils.getStudents(largeTestData);
        }
        long finishTime = System.nanoTime();
        long totalTime = finishTime - startTime;
        System.out.println("Total time (ms): " + totalTime / 1000000);
    }


    public static void main(String[] args) {
        System.out.println("getStudents: " + ExamResultUtils.getStudents(ExamResultHelper.makeTestData()));
        System.out.println("getStudents: " + ExamResultUtils.getStudents(null));
        System.out.println("getStudents: " + ExamResultUtils.getStudentsWithoutStream(ExamResultHelper.makeTestData()));
        System.out.println("getStudents: " + ExamResultUtils.getStudentsWithoutStream(null));
        System.out.println("getStudentsOnExam: "
                + ExamResultUtils.getStudentsOnExam(ExamResultHelper.makeTestData(), "PiJ"));
        System.out.println("groupByExams: " + ExamResultUtils.groupByExams(ExamResultHelper.makeTestData()));
        System.out.println("getClassificationForExam: "
                + ExamResultUtils.classificationsToResults(ExamResultHelper.makeTestData(), "FoC"));
        System.out.println("sortedClassificationForExam: "
                + ExamResultUtils.sortedclassificationsToResults(ExamResultHelper.makeTestData(), "FoC"));

        System.out.println("getStudentsParallel: " + ExamResultUtils.getStudentsParallel(ExamResultHelper.makeTestData()));

        final boolean PARALLEL_FOR_LARGE = true;
      //  runLarge(PARALLEL_FOR_LARGE);

    }
}
