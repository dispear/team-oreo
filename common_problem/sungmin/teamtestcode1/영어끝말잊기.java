import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int[] solution(int n, String[] words) {
        Set<String> Words = new HashSet<>();
        char lastChar = words[0].charAt(0);

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (Words.contains(word) || word.charAt(0) != lastChar) {
                int player = (i % n) + 1;
                int turn = (i / n) + 1;
                return new int[]{player, turn};
            }
            Words.add(word);
            lastChar = word.charAt(word.length() - 1);
        }
        return new int[]{0, 0};
    }
}
