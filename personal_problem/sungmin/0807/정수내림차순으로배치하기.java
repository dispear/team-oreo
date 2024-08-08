import java.util.Arrays;

public class Solution {
    public long solution(long n) {
        return Long.parseLong(
                Arrays.stream(Long.toString(n).split(""))
                        .sorted((a, b) -> b.compareTo(a))
                        .reduce("", (acc, digit) -> acc + digit)
        );
    }
}