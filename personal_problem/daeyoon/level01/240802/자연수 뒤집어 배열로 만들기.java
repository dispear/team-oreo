// 자연수 뒤집어 배열로 만들기
/*자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.*/

class Solution {
    public int[] solution(long n) {

        int digitCount = (int)Math.log10(n) + 1;

        int[] answer = new int[digitCount];
        int i = 0;

        while(n != 0){
            long tmp = n % 10;
            answer[i] = (int)tmp;
            n /= 10;
            i++;
        }

        return answer;
    }
}