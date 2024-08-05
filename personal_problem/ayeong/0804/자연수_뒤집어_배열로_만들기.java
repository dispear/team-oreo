
public class 자연수_뒤집어_배열로_만들기 {
    public int[] solution(long n) {
        String input = "" + n;
        int[] answer = new int[input.length()];
        int count = 0;

        while (n > 0){
            answer[count] = (int) (n % 10);
            n = n / 10 ;
            count++;
        }

        return answer;
    }
}