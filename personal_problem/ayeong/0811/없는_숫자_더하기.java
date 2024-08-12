
public class 없는_숫자_더하기 {
    public int solution(int[] numbers) {
        int answer = IntStream.rangeClosed(0,9).sum();
        for (int num : numbers) {
            answer -= num;
        }

        return answer;
    }
}