package test20240813;

public class 가운데글자가져오기 {
    public static void main(String[] args) {
    }
    class Solution {
        public String solution(String s) {
            int len = s.length();
            int mid = len / 2;

            if (len % 2 == 0) {
                return s.substring(mid - 1, mid + 1);
            } else {
                return String.valueOf(s.charAt(mid));
            }
        }
    }
}
