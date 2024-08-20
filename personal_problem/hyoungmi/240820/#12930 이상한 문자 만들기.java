import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        int j = -1;

        for (int i = 0; i < s.length(); i++) {
            j++;

            if(j % 2 == 0) {
                answer += (s.charAt(i) + "").toUpperCase();
            } else {
                answer += (s.charAt(i) + "").toLowerCase();
            }

            if (s.charAt(i) == ' ') {
                j = -1;
            }
        }

        return answer;
    }
}