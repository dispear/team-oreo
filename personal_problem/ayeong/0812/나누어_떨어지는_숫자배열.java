
public class 나누어_떨어지는_숫자배열 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(n -> n%divisor == 0).toArray();
        if (answer.length == 0) answer = new int[]{-1};
        Arrays.sort(answer);

        return answer;
    }

    public int[] solution2(int[] arr, int divisor) {
        int[] answer = {};
        int cnt = 0;

        for(int i=0 ; i<arr.length ; i++) {
            if(arr[i]%divisor==0) cnt++;
        }

        if(cnt==0) return answer = new int[]{-1};

        answer = new int[cnt];
        int index = 0;
        for(int i=0 ; i<arr.length ; i++) {
            if(arr[i]%divisor==0) {
                answer[index++] = arr[i];
            }
        }
        Arrays.sort(answer);

        return answer;
    }
}