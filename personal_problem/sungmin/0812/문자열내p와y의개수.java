public class 문자열내p와y의개수 {
    public static void main(String[] args) {
    }
    class Solution {
        boolean solution(String s) {
            int pCount = 0;
            int yCount = 0;

            for (char c : s.toLowerCase().toCharArray()) {
                if (c == 'p') {
                    pCount++;
                } else if (c == 'y') {
                    yCount++;
                }
            }
            return pCount == yCount;
        }
    }
}