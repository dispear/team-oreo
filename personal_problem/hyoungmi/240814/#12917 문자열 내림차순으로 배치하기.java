import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";

        char[] chArr = s.toCharArray();
        Arrays.sort(chArr);

        char[] chArrRev = new char[chArr.length];
        for (int i = 0; i < chArr.length; i++)
            chArrRev[i] = chArr[chArr.length - i - 1];

        return String.valueOf(chArrRev);
    }
}