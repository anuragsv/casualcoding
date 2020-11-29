public class FleschKincaid {

    public double calculateGradeLevel(String s) {
        return 0.39 * ((double) (numWords(s) / numSentences(s))) + 11.8 * ((double) (numSyllables(s) / numWords(s))) - 15.5;
    }

    public int numSentences(String s) {
        return s.split("[.!?]").length;
    }

    public int numWords(String str) {
        return str.split("\\s+").length;
    }

    public int numSyllables(String s) {
        String[] words = s.split("[.!?]|\\s+");

        int count = 0;

        for (String word : words) {
            word = word.toLowerCase();

            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == '\"'
                        || word.charAt(i) == '\''
                        || word.charAt(i) == '-'
                        || word.charAt(i) == ','
                        || word.charAt(i) == ')'
                        || word.charAt(i) == '(') {
                    word = word.substring(0, i) + word.substring(i + 1, word.length());
                }
            }

            boolean isPrevVowel = false;

            for (int j = 0; j < word.length(); j++) {
                if (word.contains("a")
                        || word.contains("e")
                        || word.contains("i")
                        || word.contains("o")
                        || word.contains("u")) {
                    if (isVowel(word.charAt(j))
                            && !((word.charAt(j) == 'e')
                            && (j == word.length() - 1))) {
                        if (!isPrevVowel) {
                            count++;
                            isPrevVowel = true;
                        }
                    } else {
                        isPrevVowel = false;
                    }
                } else {
                    count++;
                    break;
                }
            }
        }

        return count;
    }

    public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y';
    }

}
