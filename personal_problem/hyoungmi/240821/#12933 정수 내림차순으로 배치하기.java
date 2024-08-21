import java.util.*;

class Solution {
    public long solution(long n) {
        StringBuilder str = new StringBuilder();
        char[] arr = Long.toString(n).toCharArray();

        Arrays.sort(arr);

        for (int i = arr.length - 1; i >= 0; i--)
            str.append(arr[i]);

        return Long.parseLong(str.toString());
    }
}