import java.util.*;

public class Solution {
    public int[] solution(int []arr) {


        List<Integer> list = new ArrayList<>();

        int compare = arr[0];
        list.add(compare);

        for(int i = 0; i < arr.length; i++){
            if(compare != arr[i]){
                compare = arr[i];
                list.add(compare);
            }
        }

        int[] answer = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}