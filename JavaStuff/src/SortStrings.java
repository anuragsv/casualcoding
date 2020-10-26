public class SortStrings {

    public String sortStrings(String a, String b, String c) {
        String[] strArr = {a, b, c};

        for (int i = 0; i < 2; i++) {
            for (int j = i + 1; j < 2; j++) {
                if (strArr[i].compareTo(strArr[j]) > 0) {
                    String temp = strArr[i];
                    strArr[i] = strArr[j];
                    strArr[j] = temp;
                }
            }
        }

        return strArr[0] + strArr[1] + strArr[2];
    }

}
