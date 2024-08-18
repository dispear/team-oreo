class Solution {
    public int solution(int n) {
        int answer = 0;
        String reverse = "";

        String tmp = Integer.toString(n, 3);

        for(int i = tmp.length() -1; i >= 0; i--){
            reverse += tmp.charAt(i);
        }

        answer = Integer.parseInt(reverse, 3);


        return answer;
    }
}