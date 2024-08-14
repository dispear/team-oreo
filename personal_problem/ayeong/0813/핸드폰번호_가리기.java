
public class 핸드폰번호_가리기 {
    public String solution(String phone_number) {
        StringBuilder number = new StringBuilder();
        for (int i=0 ; i<phone_number.length()-4 ; i++) {
            number.append("*");
        }

        return number.append(phone_number, phone_number.length()-4, phone_number.length()).toString();
    }
}