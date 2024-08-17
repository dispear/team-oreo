import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        int[] answer;

        int temp = arr[0];
        stack.push(temp);

        for (int i = 1; i < arr.length; i++) {
            if (temp != arr[i]) {
                temp = arr[i];
                stack.push(temp);
            }
        }

        int size = stack.size();
        answer = new int[size];

        for (int i = 0; i < size; i++)
            answer[size - i - 1] = stack.pop();

        return answer;
    }
}