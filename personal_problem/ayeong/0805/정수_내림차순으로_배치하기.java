
public class 정수_내림차순_배치 {
    public long solution(long n) {
        String s = "";

        int[] numArr = new StringBuilder().append(n).chars().map(Character::getNumericValue).sorted().toArray();
        for(int i=numArr.length-1 ; i>=0 ; i--) {
            s += numArr[i]+"";
        }

        return Long.parseLong(s);
    }

}