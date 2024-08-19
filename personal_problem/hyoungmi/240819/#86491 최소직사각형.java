class Solution {
    public int solution(int[][] sizes) {
        int temp;

        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }

        int maxWidth = sizes[0][0];
        int maxHeight = sizes[0][1];

        for (int i = 1; i < sizes.length; i++) {
            if (sizes[i][0] > maxWidth)
                maxWidth = sizes[i][0];
            if (sizes[i][1] > maxHeight)
                maxHeight = sizes[i][1];
        }

        return maxWidth * maxHeight;
    }
}