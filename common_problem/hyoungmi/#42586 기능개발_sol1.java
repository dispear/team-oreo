import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();

        int[] day = new int[progresses.length];
        int temp;

        // 며칠 후에 배포가 가능한지 담는 day 배열에 값 대입 (조건이 있는 이유는, 올림 때문)
        for (int i = 0; i < progresses.length; i++)
            day[i] = ((100 - progresses[i]) % speeds[i] == 0) ? (100 - progresses[i]) / speeds[i] : (100 - progresses[i]) / speeds[i] + 1;

        int i = 0;

        while (i < day.length) {
            temp = day[i];
            stack.push(temp);
            for (int j = i + 1; j < day.length; j++) {
                if (temp >= day[j]) {
                    stack.push(day[j]);
                } else {
                    list.add(stack.size());
                    stack.clear();
                    i = j;
                    break;
                }
            }
            if (!stack.empty()) {
                list.add(stack.size());
                stack.clear();
                break;
            }
        }

        int[] answer = new int[list.size()];

        for (int k = 0; k < list.size(); k++)
            answer[k] = list.get(k);

        return answer;
    }
}