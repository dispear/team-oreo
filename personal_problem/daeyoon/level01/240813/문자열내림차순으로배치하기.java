import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < s.length(); i++){
            list.add((int) s.charAt(i));
        }

        list.sort(Comparator.reverseOrder());

        for(int c : list)
            answer.append((char)c);


        return answer.toString();
    }
}