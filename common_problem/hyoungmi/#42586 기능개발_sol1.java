import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();

        int[] day = new int[progresses.length];
        int temp;

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
                    while(!stack.empty()) {
                        stack.pop();
                    }
                    i = j;
                    break;
                }
            }
            if (!stack.empty()) {
                list.add(stack.size());
                while(!stack.empty()) {
                    stack.pop();
                }
                break;
            }
        }

        int[] answer = new int[list.size()];

        for (int k = 0; k < list.size(); k++)
            answer[k] = list.get(k);

        return answer;
    }
}