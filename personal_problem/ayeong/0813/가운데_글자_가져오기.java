
public class 가운데_글자_가져오기 {
    public String solution(String s) {
        int index = s.length() / 2;
        return (s.length() % 2 == 0) ? s.substring(index-1,index+1) : s.substring(index, index+1);
    }
}