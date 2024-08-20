import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> arr = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        int[] dayArr = new int[progresses.length];
        int day = 1;

        // 각각 작업의 남은 일수를 저장
        for (int i = 0; i < progresses.length; i++) {
            while (progresses[i] + (speeds[i] * day) < 100) {
                day++;
            }
            dayArr[i] = day;
            day = 1;
        }

        // 저장한 작업 일수를 큐에 넣음
        for(int i = 0; i < dayArr.length; i++) {
            q.offer(dayArr[i]);
        }

        // 큐에서 빼면서 다음 작업이 끝났는지 확인하고 끝났으면 기능개수 추가하고, 확인 반복
        while(!q.isEmpty()) {
            int index = q.poll();
            int num = 1;
            while(!q.isEmpty() && index >= q.peek()) {
                q.poll();
                num++;
            }
            arr.add(num);
        }

        // 동적 리스트에 값들을 정적 배열에 전달
        int[] answer = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }

        return answer;
    }
}