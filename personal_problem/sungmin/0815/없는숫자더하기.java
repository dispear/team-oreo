public class 없는숫자더하기 {
    public static void main(String[] args) {
    }
    class Solution {
        public int solution(int[] numbers) {
            int totalSum = 45;

            int sumOfNumbers = 0;
            for (int number : numbers) {
                sumOfNumbers += number;
            }
            return totalSum - sumOfNumbers;
        }
    }
}