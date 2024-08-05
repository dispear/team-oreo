public class 핸드폰번호가리기 {
    public static void main(String[] args) {
    }
    class Solution{
        public String solution(String phone_number) {
            int len = phone_number.length();
            StringBuilder sb = new StringBuilder("");

            for (int i = 0; i < len; i++) sb.append("*");
            sb.append(phone_number.substring(len - 4, len));

            return sb.toString();
        }
    }
}