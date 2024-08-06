public class 자릿수더하기 {
    public static void main(String[] args) {
    }
    public class Solution {
        public int solution(int n) {
            int result = 0;

            String str = String.valueOf(n);

            for (int i = 0; i < str.length(); i++) {
                result += Integer.valueOf(str.charAt(i) - '0');
            }
            return result;
        }
    }
}
