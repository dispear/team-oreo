class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};

        // 같은 단어 말해서 탈락
        label:
        for (int i = 1; i < words.length; i++) {
            // 앞사람이 말한 단어의 마지막 문자로 시작하지 않는 경우
            char lastChar = words[i - 1].charAt(words[i - 1].length() - 1);
            char firstChar = words[i].charAt(0);
            if (firstChar != lastChar) {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break label;
            }

            // 앞사람이 말한 단어를 또 말하는 경우
            for (int j = 0; j < i; j++) {
                if ((words[i].equals(words[j]))) {
                    answer[0] = i % n + 1;
                    answer[1] = i / n + 1;
                    break label;
                }
            }
        }

        return answer;
    }
}