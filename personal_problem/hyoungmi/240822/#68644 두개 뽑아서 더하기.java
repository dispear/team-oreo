import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        int[] intArr = new int[set.size()];

        for (int i = 0; i < set.size(); i++)
            intArr[i] = (int) set.toArray()[i];

        Arrays.sort(intArr);

        return intArr;
    }
}