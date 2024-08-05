
public class 정수_제곱근_판별 {
    public long solution(long n) {
        int x = (int) Math.sqrt(n);

        return Math.pow(x, 2)==n ? (long) Math.pow(x+1, 2) : -1;
    }
}