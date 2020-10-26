import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("c".compareTo("a"));

        Main main = new Main();

        System.out.println("Movie Interest\n");
        main.movieInterestRunner();

        System.out.println("Prime Factors\n");
        main.primeFactorRunner();

        System.out.println("Partner Swap\n");
        main.partnerSwapRunner();

        System.out.println("Student Average\n");
        main.studentAverageRunner();

        System.out.println("Sum Pair\n");
        main.sumPairRunner();

        System.out.println("Weekly Pay\n");
        main.weeklyPayRunner();
    }

    private void movieInterestRunner() {
        MovieInterest movieInterest = new MovieInterest();

        String response = movieInterest.movieTime(3.75, 3);
        System.out.println("movieTime ( 3.75, 3 ) returns \"" + response + "\"");

        response = movieInterest.movieTime(13.00, 5);
        System.out.println("movieTime (13.00, 5 ) returns \"" + response + "\"");

        response = movieInterest.movieTime(9.00, 4);
        System.out.println("movieTime ( 9.00, 4 ) returns \"" + response + "\"");

        response = movieInterest.movieTime(8.00, 5);
        System.out.println("movieTime ( 8.00, 5 ) returns \"" + response + "\"\n");
    }

    private void partnerSwapRunner() {
        List<String> row = new ArrayList<>();
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

        String[][] partners = {
                {"O", "B"},
                {"Y", "V"},
                {"Z", "W"},
                {"K", "Q"},
                {"R", "P"},
                {"T", "E"},
                {"D", "N"},
                {"L", "S"},
                {"F", "G"},
                {"M", "A"},
                {"I", "X"},
                {"H", "C"},
                {"J", "U"}
        };

        PartnerSwap partnerSwap = new PartnerSwap(row, partners);

        System.out.println(row.toString() + "\n");

        for (String[] partnerItem : partners) {
            System.out.print("{" + partnerItem[0] + ", " + partnerItem[1] + "}\n");
        }
        System.out.println();

        System.out.println(partnerSwap.rearrange().toString() + "\n");
    }

    private void primeFactorRunner() {
        PrimeFactor primeFactor = new PrimeFactor(7);
        System.out.println("7: " + primeFactor.getPrimeFactors().toString());

        primeFactor = new PrimeFactor(30);
        System.out.println("30: " + primeFactor.getPrimeFactors().toString());

        primeFactor = new PrimeFactor(285);
        System.out.println("285: " + primeFactor.getPrimeFactors().toString());

        primeFactor = new PrimeFactor(770);
        System.out.println("770: " + primeFactor.getPrimeFactors().toString() + "\n");
    }

    private void studentAverageRunner() {
        String[][] scores = {
                {"Jerry", "90"},
                {"Bob", "91"},
                {"Jerry", "100"},
                {"Eric", "83"}
        };

        StudentAverage studentAverage = new StudentAverage(scores);

        System.out.println("Best Student: " + studentAverage.getBestStudent());
        System.out.println("Best Average: " + studentAverage.getBestAverage() + "\n");
    }

    private void sumPairRunner() {
        int sum = 220;

        List<Integer> numberList = new ArrayList<>();
        numberList.add(100);
        numberList.add(180);
        numberList.add(40);
        numberList.add(120);
        numberList.add(10);

        SumPair sumPair = new SumPair(sum, numberList);
        int[] result = sumPair.getSumPair();

        System.out.println("Sum: " + sum);
        System.out.println("List: " + numberList.toString());
        System.out.println("Pair: [" + result[0] + ", " + result[1] + "]\n");
    }

    private void weeklyPayRunner() {
        WeeklyPay weeklyPay = new WeeklyPay();

        System.out.println("calculatePay (20, 15) returns " + weeklyPay.calculatePay(20, 15));
        System.out.println("calculatePay (50, 10) returns " + weeklyPay.calculatePay(50, 10));
        System.out.println("calculatePay (50, 25) returns " + weeklyPay.calculatePay(50, 25));
    }

}
