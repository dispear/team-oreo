public static void main(String[] args) {
    }
    class Solution {
        public boolean solution(int x) {
            boolean answer = true;
            String hap = Integer.toString(x);
            int hap_n = 0;
            for(int i = 0; i<hap.length() ; i++){
                hap_n += hap.charAt(i)-48;
            }
            if(x%hap_n==0){
                answer = true;
            } else {
                answer = false;
            }
            return answer;
        }
    }
}