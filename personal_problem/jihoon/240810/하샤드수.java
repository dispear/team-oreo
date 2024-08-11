class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int n = 0;
        int a = x;
        
        while(x > 0){
            n += x % 10;
            x /= 10;
        }

        if(a % n != 0)
            answer = false;
        
        return answer;
    }
}
