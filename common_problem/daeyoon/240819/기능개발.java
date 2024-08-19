import java.util.*;

class Solution {
    public ArrayList solution(int[] progresses, int[] speeds) {
        //결과를 반환할 int형을 담는 ArrayList answer 선언
	    // progresses의 각 인덱스 값이 100을 넘는 최소일수를 담을 Queue queue선언 
        ArrayList<Integer> answer = new ArrayList<Integer>();
        Queue<Integer> queue = new LinkedList<Integer>();
        
        
        for(int i=0; i < progresses.length; i++){
            //progresses의 길이만큼 for문을 돌면서 , 
            //progresses 각 인덱스 값이 100을 넘기 위한 최소일수 계산 후 queue에 add 메소드로 넣기
            // Math.ceil 함수 -> 반올림 함수 && 반환 값이 double형이므로 int 형변환
            queue.add((int)Math.ceil((100.0 - progresses[i]) / speeds[i]));        
        }
        
        // queue가 텅 빌 때까지 while문을 돌리기
        while(!queue.isEmpty()){
        //queue에서 꺼낸 값을 minDays에 저장
		int minDays = queue.poll();
            int count = 1;
            
            //queue가 비어있지 않고, 
            //queue.peek()의 값이 그 전에 poll()을 통해 얻은 값, 즉 minDays 보다 작은 동안
            while(!queue.isEmpty() && queue.peek() <= minDays){
                queue.poll();
                count++;
            }
			//count의 값을 answer배열에 추가
            answer.add(count);
        }

        return answer;
    }
}