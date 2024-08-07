
public class 평균_구하기 () {
    public double solution(int[] arr) {
        return Arrays.stream(arr).average().orElse(0);
    }
}