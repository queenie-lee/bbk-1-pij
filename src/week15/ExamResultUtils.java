package week15;

import java.util.*;
import java.util.stream.Collectors;

public class ExamResultUtils {
    public static List<String> getStudents(Collection<? extends ExamResult> results) {
        // exception case if we call null
        return results == null ? new ArrayList<>() : results.stream()
                .map(ExamResult::getStudentName)
                .distinct()
                .sorted()
                .toList();
    }

    public static List<String> getStudentsWithoutStream(Collection<? extends ExamResult> results) {
        // exception case if we call null
        if (results == null) {
            return new ArrayList<>();
        }
        // Using a Set instead of an ArrayList make the values distinct
        Set<String> studentNames = new HashSet<>();
        for (ExamResult result : results) {
            studentNames.add(result.getStudentName());
        }
        // deriving a list from the set
        List<String> listOfStudentNames = new ArrayList<>(studentNames);
        listOfStudentNames.sort(null); //A null value indicates that the elements' natural ordering should be used
        return listOfStudentNames;
    }

    public static List<String> getStudentsParallel(Collection<? extends ExamResult> results) {
        return null; // TODO
    }

    public static List<String>
            getStudentsOnExam(Collection<? extends ExamResult> results, String exam) {

        return getStudents(
                results.stream()
                        .filter(examResult -> examResult.getExamName().equals(exam))
                        .toList()
        );
    }

    public static Map<String, List<ExamResult>> groupByExams(Collection<? extends ExamResult> results) {
        return results.stream()
                .collect(Collectors.groupingBy(ExamResult::getExamName));
    }

    public static Map<ExamResult.Classification, List<ExamResult>>
                classificationsToResults(Collection<? extends ExamResult> results, String exam) {

        return results.stream()
                .filter(examResult -> examResult.getExamName().equals(exam))
                .collect(Collectors.groupingBy(ex -> ExamResult.Classification.fromMarks(ex.getMarks())));
    }

    /**
     *
     */
    public static Map<ExamResult.Classification, List<ExamResult>>
    allclassificationsToResults(Collection<? extends ExamResult> results, String exam) {
        return Arrays
                .stream(ExamResult.Classification.values()) // Fail, Pass, Merit, Distinction
                .collect(Collectors.toMap(classification -> classification,
                        classification -> results
                                .stream()
                                // filtering results, getting only results where exam name is equal to exam we want to look at
                                // && checking classification is relevant to the exam we are looking at in the stream
                                .filter(result -> result.getExamName().equals(exam) && ExamResult.Classification.fromMarks(
                                        result.getMarks()).equals(classification))
                                .collect(Collectors.toList())));
    }

    public static Map<ExamResult.Classification, List<ExamResult>>
    sortedclassificationsToResults(Collection<? extends ExamResult> results, String exam) {
        return Arrays
                .stream(ExamResult.Classification.values()) // fail, pass, merit, distinction
                .collect(Collectors.toMap(
                        classification -> classification, // key function
                        classification -> results // value function
                                .stream()
                                // filtering results, getting only results where exam name is equal to exam we want to look at
                                // && checking classification is relevant to the exam we are looking at in the stream
                                .filter(result -> result.getExamName().equals(exam) && ExamResult.Classification.fromMarks(
                                        result.getMarks()).equals(classification))
                                .collect(Collectors.toList()),
                        // third parameter to provide the merge function
                        // oldVal and newVal are lists of the same results
                        (oldVal, newVal) -> oldVal, // consolidating the different values to the same key
                        TreeMap::new));
    }

}
