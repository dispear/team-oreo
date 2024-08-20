

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        answer[0] = getGcd(n,m);
        answer[1] = a * b / answer[0];

        return answer;
    }

    public int getGcd(int a, int b) {
        if(b==0) {
            return a;
        }
        return (b, a%b);
    }

}