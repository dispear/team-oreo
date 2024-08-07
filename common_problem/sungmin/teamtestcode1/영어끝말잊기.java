import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int[] solution(int n, String[] words) {
        public int[] solution ( int n, String[] words){
            Set<String> usew = new HashSet<>(); //사용한 단어 저장
            char c = words[0].charAt(0);

            for (int i = 0; i < words.length; i++) {
                String w = words[i]; // 검사

                if (s.contains(w) || w.charAt(0) != c) {
                    int p = (i % n) + 1;
                    int t = (i / n) + 1;
                    return new int[]{p, t};
                }
                s.add(w);
                c = w.charAt(w.length() - 1);
            }
            return new int[]{0, 0};
        }
    }
}