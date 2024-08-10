import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> ar = new ArrayList<>();

        for (int elem : arr) {
            if (elem % divisor == 0)
                ar.add(elem);
        }

        if (ar.isEmpty())
            ar.add(-1);

        int[] answer = new int[ar.size()];

        for (int i = 0; i < ar.size(); i++)
            answer[i] = ar.get(i);

        Arrays.sort(answer);

        return answer;
    }
}