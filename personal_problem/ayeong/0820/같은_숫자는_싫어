
public class 같은_숫자는_싫어 {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;

        list.add(arr[0]);
        for (int i=1 ; i<arr.length ; i++) {
            if(!(list.get(count)==arr[i])) {
                ++count;
                list.add(arr[i]);
            }
        }

        int[] answer = new int[list.size()];
        for(int i=0 ; i<list.size() ; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}