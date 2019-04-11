

import java.util.HashMap;
import java.util.List;

class PartnerSwap {

    List<String> rearrange(
            List<String> row,
            HashMap<String, Integer> rowMap,
            HashMap<String, String> pairMap,
            HashMap<String, String> pairMapInverse) {
        for (int i = 0; i < row.size(); i += 2) {
            String item0 = row.get(i);
            String item1 = row.get(i + 1);
            String partner;
            int pIndex;

            if (pairMap.containsKey(item0)) {
                partner = pairMap.get(item0);
                pIndex = rowMap.get(partner);
            } else {
                partner = pairMapInverse.get(item0);
                pIndex = rowMap.get(partner);
            }

            swap(row.subList(i, 26), i + 1 - row.subList(0, i).size(), pIndex - row.subList(0, i).size());

            rowMap.put(item1, pIndex);
            rowMap.put(partner, i + 1);
        }

        return row;
    }

    private void swap(List<String> row, int index0, int index1) {
        String item0 = row.get(index0);
        String item1 = row.get(index1);

        row.remove(index0);
        row.add(index0, item1);

        row.remove(index1);
        row.add(index1, item0);
    }

}
