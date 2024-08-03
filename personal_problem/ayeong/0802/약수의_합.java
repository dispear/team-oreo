
public class 약수의_합 {
    public int solution(int n) {
        int sum = 0;
        int sqrt = (int) Math.sqrt(n);

        for (int i=1; i<=sqrt; i++) {
            if (n%i == 0) {
                sum += i + (n/i);
                if (i == (n/i)) sum -= (n/i);
            }
        }

        return sum;
    }
}