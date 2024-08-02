class Solution {
    public int solution(int n) {
        int sum = 0;

        for (int i = 1; i < n / i + 1; i++) {
            if (n % i == 0) {
                sum += (i + n / i);
                // ex) n이 16인 경우, 위대로 하면 4가 2번 들어감. 따라서 한 번 뺴준다.
                if (i == n / i)
                    sum -= i;
            }
        }

        return sum;
    }
}