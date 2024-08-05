import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};

        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < words.length; i++){
            if(i > 0){
                String first_word = words[i - 1];
                String next_word = words[i];

                char first = first_word.charAt(first_word.length() - 1);
                char last = next_word.charAt(0);

                if(map.containsKey(next_word) || first != last){
                    answer[0] = (i % n) + 1;
                    answer[1] = (i / n) + 1;

                    return answer;
                }
            }

            map.put(words[i], 1);
        }


        return answer;
    }
}