class Solution {
    public long solution(int a, int b) {
        long sum = 0;
        int i;

        if (a < b) {
            for (i = a; i <= b; i++)
                sum += i;
        } else if (a > b) {
            for (i = b; i <= a; i++)
                sum += i;
        }

        return sum;
    }
}