public class 약수의합 {
    public static void main(String[] args) {
    }
    class Solution {
        public int solution(int N) {
            int answer = 0;
            for (int i = 1; i <= N; i++) {
                if (N % i == 0) {
                    answer = answer + i;
                }
            }
            return answer;
        }
    }
}