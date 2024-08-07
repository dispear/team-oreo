public class 자연수뒤집어배열로만들기 {
    public static void main(String[] args) {
    }
    class Solution {
        public int[] solution(long n) {
            String s = Long.toString(n);

            StringBuilder sb = new StringBuilder(s);

            String[] strArr = sb.reverse().toString().split("");

            int[] result = new int[strArr.length];

            for (int i = 0; i < strArr.length; i++) {
                result[i] = Integer.parseInt(strArr[i]);
            }
            return result;
        }
    }
}
