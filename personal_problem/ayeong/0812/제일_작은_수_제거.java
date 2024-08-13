
public class 제일_작은_수_제거 {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int cnt = 0;

        if(arr.length==1) return answer = new int[]{-1};

        int a = arr[0];
        for(int i=1 ; i<arr.length ; i++) {
            if(a>arr[i]) a = arr[i];
        }

        answer = new int[arr.length-1];
        for(int i=0 ; i<arr.length ; i++) {
            if(arr[i]!=a) answer[cnt++] = arr[i];
        }

        return answer;
    }
}