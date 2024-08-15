class Solution {
    public int solution(int[][] sizes) {
        int max = 0;
        int min = 0;

        for (int[] size : sizes) {
            int longer = Math.max(size[0], size[1]);
            int shorter = Math.min(size[0], size[1]);

            max = Math.max(max, longer);
            min = Math.max(min, shorter);
        }
        return max * min;
    }
}