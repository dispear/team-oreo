import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        // 최솟값을 담는 min 변수 선언
        int min = arr[0];
        // arr 길이가 1일 경우 answer에 길이가 1인 배열, 아닐 경우 arr.length보다 1 짧은 배열 할당
        int[] answer = (arr.length == 1) ? new int[1] : new int[arr.length - 1];
        int index = 0;

        // 제일 작은 수 찾기
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // 제일 작은 수와 같은 값이면(즉 제일 작은 수이면) answer 배열에 넣지 않고, 나머지는 answer 배열에 넣어준다.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min)
                answer[index++] = arr[i];
            else
                continue;
        }

        if (arr.length == 1)
            answer[0] = -1;

        return answer;
    }
}