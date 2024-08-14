public class 제일작은수제거하기 {
    public static void main(String[] args) {
    }
    class Solution {
        public int[] solution(int[] arr) {
            if (arr.length == 1) {
                return new int[]{-1};
            }
            int minIndex = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[minIndex]) {
                    minIndex = i;
                }
            }
            int[] result = new int[arr.length - 1];

            for (int i = 0, j = 0; i < arr.length; i++) {
                if (i != minIndex) {
                    result[j++] = arr[i];
                }
            }
            return result;
        }
    }
}
