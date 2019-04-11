import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.partnerSwapRunner();
    }

    private void partnerSwapRunner() {
        PartnerSwap partnerSwap = new PartnerSwap();

        List<String> row = new ArrayList<String>();
        row.add("A");
        row.add("B");
        row.add("C");
        row.add("D");
        row.add("E");
        row.add("F");
        row.add("G");
        row.add("H");
        row.add("I");
        row.add("J");
        row.add("K");
        row.add("L");
        row.add("M");
        row.add("N");
        row.add("O");
        row.add("P");
        row.add("Q");
        row.add("R");
        row.add("S");
        row.add("T");
        row.add("U");
        row.add("V");
        row.add("W");
        row.add("X");
        row.add("Y");
        row.add("Z");

        HashMap<String, Integer> rowMap = new HashMap<String, Integer>();
        for (int i = 0; i < row.size(); i++) {
            rowMap.put(row.get(i), i);
        }

        System.out.println(row.toString() + "\n");

        String[][] pairs = {{ "O", "B" },
                            { "Y", "V" },
                            { "Z", "W" },
                            { "K", "Q" },
                            { "R", "P" },
                            { "T", "E" },
                            { "D", "N" },
                            { "L", "S" },
                            { "F", "G" },
                            { "M", "A" },
                            { "I", "X" },
                            { "H", "C" },
                            { "J", "U" }};

        HashMap<String, String> pairMap = new HashMap<String, String>();
        HashMap<String, String> pairMapInverse = new HashMap<String, String>();
        for (String[] pairItem : pairs) {
            pairMap.put(pairItem[0], pairItem[1]);
            pairMapInverse.put(pairItem[1], pairItem[0]);
        }

        System.out.println("Partners List:");
        for (String[] pairItem : pairs) {
            System.out.print("{" + pairItem[0] + ", " + pairItem[1] + "}\n");
        }
        System.out.println();

        System.out.println(partnerSwap.rearrange(row, rowMap, pairMap, pairMapInverse).toString());
    }

}
