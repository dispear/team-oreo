import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 나누어떨어지는숫자배열 {
    public static void main(String[] args) {
    }
    public int[] solution(int[] arr, int divisor) {
        List<Integer> resultList = new ArrayList<>();

        Arrays.sort(arr);

        for (int num : arr) {
            if (num % divisor == 0) {
                resultList.add(num);
            }
        }
        if (resultList.isEmpty()) {
            return new int[] {-1};
        }
        int[] answer = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }
        return answer;
    }
}