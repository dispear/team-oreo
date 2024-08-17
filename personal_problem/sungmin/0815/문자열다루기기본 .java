public class 문자열다루기기본 {
    public static void main(String[] args) {
    }
    class Solution {
        public boolean solution(String s) {
            if (s.length() != 4 && s.length() != 6) {
                return false;
            }

            for (char c : s.toCharArray()) {
                if (!Character.isDigit(c)) {
                    return false;
                }
            }
            return true;
        }
    }
}