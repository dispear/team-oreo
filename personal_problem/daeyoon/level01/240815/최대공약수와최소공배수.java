class Solution {
    public int[] solution(int n, int m) {

        int max = 1;
        int min = 0;

        int[] answer = new int[2];

        for(int i = 1; i <= Math.min(n,m); i++){
            if(m % i == 0 && n % i == 0)
                max = i;
        }

        min = n * m / max;

        answer[0] = max;
        answer[1] = min;


        return answer;
    }
}