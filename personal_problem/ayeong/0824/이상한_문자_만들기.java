
public class 이상한_문자_만들기 {
    public String solution(String s) {
        int count = 0;
        String answer = "";
        String[] sArray = s.split("");

        for (String str : sArray) {
            if (!" ".equals(str)) {
                answer += count%2==0 ? str.toUpperCase() : str.toLowerCase();
                count++;
            } else {
                answer += "0";
                count = 0;
            }
        }

        return answer.replaceAll("0", " ");
    }
}