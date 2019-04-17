import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given a list of people sitting in a row as an ArrayList, and a list of
 * partners given as a two-dimensional array, rearrange the ArrayList such that
 * each person in the list is sitting next to their partner using only a swap
 * function that swaps any two people in the ArrayList.
 */

class PartnerSwap {

    private List<String> row;

    private Map<String, Integer> rowMap;
    private Map<String, String> partnerMap;
    private Map<String, String> partnerMapInverse;

    /**
     * Constructor for PartnerSwap class.
     *
     * @param row List of people sitting in a row
     * @param partners Two-dimensional String array containing pairs of people
     */
    PartnerSwap(List<String> row, String[][] partners) {
        this.row = row;

        rowMap = new HashMap<>();
        for (int i = 0; i < this.row.size(); i++) {
            rowMap.put(row.get(i), i);
        }

        partnerMap = new HashMap<>();
        partnerMapInverse = new HashMap<>();
        for (String[] partnerItem : partners) {
            partnerMap.put(partnerItem[0], partnerItem[1]);
            partnerMapInverse.put(partnerItem[1], partnerItem[0]);
        }
    }

    /**
     * Rearranges the List to make sure all partners are sitting next to each
     * other.
     *
     * @return list containing the people sitting in a row
     */
    List<String> rearrange() {
        for (int i = 0; i < row.size(); i += 2) {
            String item0 = row.get(i);
            String item1 = row.get(i + 1);
            String partner;
            int pIndex;

            if (partnerMap.containsKey(item0)) {
                partner = partnerMap.get(item0);
                pIndex = rowMap.get(partner);
            } else {
                partner = partnerMapInverse.get(item0);
                pIndex = rowMap.get(partner);
            }

            swap(row.subList(i, 26), i + 1 - row.subList(0, i).size(), pIndex - row.subList(0, i).size());

            rowMap.put(item1, pIndex);
            rowMap.put(partner, i + 1);
        }

        return row;
    }

    /**
     * This method takes a List<String> object, index of first element and index
     * of second element, and swaps the two elements in the list.
     *
     * @param row list to swap elements in
     * @param index0 Index of first element to swap
     * @param index1 Index of second element to swap
     */
    private void swap(List<String> row, int index0, int index1) {
        String item0 = row.get(index0);
        String item1 = row.get(index1);

        row.remove(index0);
        row.add(index0, item1);

        row.remove(index1);
        row.add(index1, item0);
    }

}
