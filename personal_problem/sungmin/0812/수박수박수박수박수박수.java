public class 수박수박수박수박수박수 {
    public static void main(String[] args) {
    }
    class Solution {
        public String solution(int n) {
            String pattern = "수박";
            StringBuilder sb = new StringBuilder();

            while (sb.length() < n) {
                sb.append(pattern);
            }
            return sb.substring(0, n);
        }
    }
}