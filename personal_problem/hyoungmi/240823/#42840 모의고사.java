import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] count = {0, 0, 0};

        int[] s1 = new int[answers.length];
        int[] s2 = new int[answers.length];
        int[] s3 = new int[answers.length];

        for (int i = 0; i < answers.length; i++) {

            s1[i] = ((i + 1) % 5 == 0) ? 5 : (i + 1) % 5;

            if (i % 8 == 1) {
                s2[i] = 1;
            } else if (i % 8 == 3) {
                s2[i] = 3;
            } else if (i % 8 == 5) {
                s2[i] = 4;
            } else if (i % 8 == 7) {
                s2[i] = 5;
            } else {
                s2[i] = 2;
            }

            switch(i % 10) {
                case 0, 1 -> s3[i] = 3;
                case 2, 3 -> s3[i] = 1;
                case 4, 5 -> s3[i] = 2;
                case 6, 7 -> s3[i] = 4;
                case 8, 9 -> s3[i] = 5;
            }
        }

        for (int i = 0; i < answers.length; i++) {
            if (s1[i] == answers[i])
                count[0]++;
            if (s2[i] == answers[i])
                count[1]++;
            if (s3[i] == answers[i])
                count[2]++;
        }

        int maxCount = count[0];

        for (int i = 1; i < count.length; i++) {
            if (count[i] > maxCount)
                maxCount = count[i];
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] == maxCount)
                list.add(i + 1);
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}