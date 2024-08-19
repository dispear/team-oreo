class Solution {
    public int solution(int[] num) {
        int answer = 0;
        int tmp = 0;

        for(int i = 0; i < num.length; i++){
            for(int j = i + 1; j < num.length; j++){
                for(int k = j + 1; k < num.length; k++){
                    tmp = num[i] + num[j] + num[k];
                    if(tmp == 0)
                        answer++;
                }
            }
        }

        return answer;
    }
}