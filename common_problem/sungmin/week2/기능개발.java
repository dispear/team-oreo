import java.util.*;

public class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> result = new ArrayList<>();
        int n = progresses.length;

        int days = (int) Math.ceil((100.0 - progresses[0]) / speeds[0]);
        int count = 1;

        for (int i = 1; i < n; i++) {
            int currentDays = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);

            if (currentDays <= days) {
                count++;
            } else {
                result.add(count);
                count = 1;
                days = currentDays;
            }
        }

        result.add(count);
        return result.stream().mapToInt(i -> i).toArray();
    }
}