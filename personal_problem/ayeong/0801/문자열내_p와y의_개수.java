public class 문자열내_p와y의_개수 {
    boolean solution(String s) {
        int a = 0;
        for (int i = 0; i < s.length(); i++) {
            String alpa = String.valueOf(s.charAt(i));
            if(alpa.equalsIgnoreCase("p")){
                a++;
            } else if(alpa.equalsIgnoreCase("y")){
                a--;
            }
        }

        return a==0;
    }