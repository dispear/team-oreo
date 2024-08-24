import java.util.*;
class Solution {
    public static String solution(int[] food) {
        int total = 0;

        // total에 1을 더한 것은 생수
        String[] arr = new String[total + 1];
        int index = 0;
        arr[arr.length / 2] = "0";

        for (int i = 1; i < food.length; i++) {
            while(food[i] > 1) {
                arr[index] = i + "";
                arr[arr.length - index - 1] = i +"";
                food[i] -= 2;
                index++;
            }
        }

        return String.join("", arr);
    }
}