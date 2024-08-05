public class 평균구하기 {
    public static void main(String[] args) {
    }

    class Solution {
        public double solution(int[] arr) {
            int sum = 0;
            for (int num : arr) {
                sum += num;
            }
            double average = (double) sum / arr.length;
            return average;
        }
    }
}