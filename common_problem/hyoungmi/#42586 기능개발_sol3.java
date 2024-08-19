import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> que = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();

        int temp;
        int day;
        int count;

        for (int i = 0; i < progresses.length; i++) {
            day = ((100 - progresses[i]) % speeds[i] == 0) ? (100 - progresses[i]) / speeds[i] : (100 - progresses[i]) / speeds[i] + 1;
            que.add(day);
        }

        while (!que.isEmpty()) {
            temp = que.poll();
            count = 1;
            while (!que.isEmpty() && temp >= que.peek()) { // 등호!
                que.poll();
                count++;
            }
            list.add(count);
        }

        int[] answer = new int[list.size()];

        for (int k = 0; k < list.size(); k++)
            answer[k] = list.get(k);

        return answer;
    }
}