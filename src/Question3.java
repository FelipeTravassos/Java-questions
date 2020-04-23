//O(n)
public class Question3 {

    public boolean checkTypos(String firstWord, String secondWord) {
        char[] word1 = firstWord.toCharArray();
        char[] word2 = secondWord.toCharArray();
        int difCount = 0;

        for (int i = 0, j = 0; i < word1.length && j < word2.length && difCount < 2; i++, j++) {
            if (word1[i] != word2[j]) {
                ++difCount;

                if (word1.length < word2.length) --i;
                if (word2.length < word1.length) --j;
            }
        }

        return difCount < 2;
    }
}
