import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given a sum as an integer and a list of numbers as a List, find a pair of
 * numbers in the list that add up to the sum and return their indices in the
 * List. If multiple pairs are found, then pick the pair with the highest
 * number.
 */

class SumPair {

    private int[] sumPair;

    /**
     * Constructor for the SumPair class. The constructor also computes the pair
     * that adds up to the given sum.
     *
     * @param sum Integer of the Sum for which the pairs need to determined
     * @param numberList List of numbers among which to find the pair of numbers
     */
    SumPair(int sum, List<Integer> numberList) {
        Map<Integer, Integer> numberMap = new HashMap<>();
        for (int i = 0; i < numberList.size(); i++) {
            numberMap.put(numberList.get(i), i);
        }

        int highestNumber = 0;
        sumPair = new int[2];

        for (Map.Entry<Integer, Integer> entry : numberMap.entrySet()) {
            int temp = sum - entry.getKey();

            if (temp >= 0 && numberMap.containsKey(temp)) {
                if (Math.max(entry.getKey(), temp) > highestNumber) {
                    highestNumber = Math.max(entry.getKey(), temp);

                    sumPair[0] = Math.min(entry.getValue(), numberMap.get(temp));
                    sumPair[1] = Math.max(entry.getValue(), numberMap.get(temp));
                }
            }
        }
    }

    /**
     * Returns the pair of numbers.
     *
     * @return Integer array of the pair of numbers
     */
    int[] getSumPair() {
        return sumPair;
    }

}
