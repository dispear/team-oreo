class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuilder reversedBase3 = new StringBuilder();

        while (n > 0) {
            reversedBase3.append(n % 3);
            n = n / 3;
        }
        for (int i = 0; i < reversedBase3.length(); i++) {
            answer += (reversedBase3.charAt(i) - '0') * Math.pow(3, reversedBase3.length() - 1 - i);
        }
        return answer;
    }
}
