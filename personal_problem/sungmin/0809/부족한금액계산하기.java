public class 부족한금액계산하기 {
    public static void main(String[] args) {
    }
    class Solution {
        public long solution(int price, int money, int count) {
            long totalCost = (long)price * count * (count + 1) / 2;
            long answer = totalCost - money;

            return answer > 0 ? answer : 0;
        }
    }
}
