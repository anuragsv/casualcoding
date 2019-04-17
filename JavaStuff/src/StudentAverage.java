import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given a list of student names and their respective grades as a
 * two-dimensional String array, where one student can have multiple entries,
 * find the student with the highest average grade in the class as well as the
 * highest average grade in the class.
 *
 * Ex1: String[][] scores = {
 *              {"Jerry", "90"},
 *              {"Bob", "91"},
 *              {"Jerry", "100"},
 *              {"Eric", "83"}
 *      };
 *
 *      Best student: Jerry
 *      Best average: 95
 *
 * Ex2: String[][] scores = {
 *              {"Jerry", "90"},
 *              {"Bob", "91"},
 *              {"Jerry", "62"},
 *              {"Eric", "83"}
 *      };
 *
 *      Best student: Bob
 *      Best average: 91
 */

class StudentAverage {

    private String bestStudent;
    private double bestAverage;

    /**
     * Constructor for the StudentAverage class. The best average grade and the
     * best student are computed within the constructor.
     *
     * @param scores Two-dimensional String array containing student names and
     *               grades.
     */
    StudentAverage(String[][] scores) {
        Map<String, List<Integer>> scoreMap = new HashMap<>();

        for (String[] scoreItem : scores) {
            if (scoreMap.containsKey(scoreItem[0])) {
                try {
                    scoreMap.get(scoreItem[0]).add(Integer.parseInt(scoreItem[1]));
                } catch (NumberFormatException e) {
                    System.out.println("Make sure all scores are in number format");
                }
            } else {
                try {
                    List<Integer> studentScores = new ArrayList<>();
                    studentScores.add(Integer.parseInt(scoreItem[1]));
                    scoreMap.put(scoreItem[0], studentScores);
                } catch (NumberFormatException e) {
                    System.out.println("Make sure all scores are in number format");
                }
            }
        }

        bestStudent = "";
        bestAverage = 0;
        for (Map.Entry<String, List<Integer>> entry : scoreMap.entrySet()) {
            int avg = 0;
            for (int score : entry.getValue()) {
                avg += score;
            }
            avg /= entry.getValue().size();

            if (avg > bestAverage) {
                bestAverage = avg;
                bestStudent = entry.getKey();
            }
        }
    }

    /**
     * Returns the best student as a String.
     * @return String of the best student's name.
     */
    String getBestStudent() {
        return bestStudent;
    }

    /**
     * Returns the best average grade as a double.
     * @return double of the best average grade.
     */
    double getBestAverage() {
        return bestAverage;
    }

}
