import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();

        for (num : nums)
            set.add(num);

        return Math.min(nums.length / 2, set.size());
    }
}
