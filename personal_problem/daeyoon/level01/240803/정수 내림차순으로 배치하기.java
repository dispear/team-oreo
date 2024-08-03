/*함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
 예를들어 n이 118372면 873211을 리턴하면 됩니다.*/

import java.util.*;

class Solution {
    public long solution(long n) {
        int digitCount = (int)Math.log10(n) + 1;

        List<Long> list = new ArrayList<>();

        for(int i = 0; i < digitCount; i++){
            long tmp = n % 10;
            n /= 10;
            list.add(tmp);
        }

        list.sort(Comparator.reverseOrder());

        StringBuilder answer = new StringBuilder();

        for(int i = 0; i < list.size(); i++){
            answer.append(list.get(i));
        }

        return Long.parseLong(answer.toString());
    }
}