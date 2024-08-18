import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();

        // 작업 기간
        int[] day = new int[progresses.length];

        for (int i = 0; i < progresses.length; i++)
            day[i] = ((100 - progresses[i]) % speeds[i] == 0) ? (100 - progresses[i]) / speeds[i] : (100 - progresses[i]) / speeds[i] + 1;


        int count = 1;
        int temp = day[0];
        int i = 1;

        while (i < progresses.length) {
            if (temp >= day[i]) {
                count++;
            } else {
                list.add(count);
                count = 1;
                temp = day[i];
            }
            i++;
        }
        list.add(count);


        int[] answer = new int[list.size()];

        for (int k = 0; k < list.size(); k++)
            answer[k] = list.get(k);

        return answer;
    }
}