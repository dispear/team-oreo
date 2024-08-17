
public class 문자열_다루기_기본 {

    public boolean solution(String s) {
        int cnt = 0;
        for(int i=0 ; i<s.length() ; i++) {
            if(s.charAt(i)>=48 && s.charAt(i)<=57) cnt++;
        }

        return (cnt == s.length()) && lengthCheck(s);
    }

    public boolean lengthCheck(String s) {
        return (s.length()==4 || s.length()==6);
    }

}