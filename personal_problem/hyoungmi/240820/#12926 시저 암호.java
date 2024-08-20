class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ')
                sb.append(" ");
            else if (s.charAt(i) >= 65 && s.charAt(i) <= 90)
                sb.append((char)((s.charAt(i) + n - 65) % 26 + 65) + "");
            else if (s.charAt(i) >= 97 && s.charAt(i) <= 122)
                sb.append((char)((s.charAt(i) + n - 97) % 26 + 97) + "");
        }

        return sb.toString();
    }
}