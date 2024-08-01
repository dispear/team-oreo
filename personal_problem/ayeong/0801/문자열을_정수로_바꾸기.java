public class 문자열을_정수로_바꾸기 {
    int solution (String s) {
        String number = "";

        if(s.contains("+") || s.contains("-")) {
            number = s.substring(1);
        } else {
            number = s;
        }
        int answer = Integer.parseInt(number);

        return s.startsWith("-") ? (answer*-1) : answer;
    }
}