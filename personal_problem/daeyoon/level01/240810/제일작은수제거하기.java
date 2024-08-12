import java.util.*;

class Solution {
    public int[] solution(int[] arr) {

        int compare = arr[0];
        int[] answer = new int[arr.length - 1];


        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i ++){
            if(compare >= arr[i])
                compare = arr[i];
        }

        for(int i = 0; i < arr.length; i++){
            if(compare < arr[i])
                list.add(arr[i]);
        }

        if(list.size() <= 1)
            return new int[] {-1};

        for(int i = 0; i < arr.length - 1; i++){
            answer[i] = list.get(i);
        }


        return answer;
    }
}