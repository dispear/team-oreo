
public class 자릿수더하기 {
    public int solution(int n) {
        int answer = 0;
        if (n > 9) {
            String s = String.valueOf(n);
            for (int i = 0; i < s.toCharArray().length; i++) {
                answer += Integer.parseInt(String.valueOf(s.charAt(i)));
            }
        } else {
            answer = n;
        }

        return answer;
    }
}