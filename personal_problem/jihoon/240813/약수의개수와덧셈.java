class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i = left;i<= right;i++){
            answer += i != Math.pow((int)Math.sqrt(i), 2) ? i : -i;
        }
        return answer;
    }
}
