public class Solution {
    public int solution(int n) {
        int sum = 0;
        String num = n + "";

        for (int i = 0; i < num.length(); i++)
            sum += (num.charAt(i) - '0');

        return sum;
    }
}