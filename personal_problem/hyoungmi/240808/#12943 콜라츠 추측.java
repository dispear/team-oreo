public class N12943콜라츠추측 {
    public static void main(String[] args) {
        solution(626331);
    }
    public static int solution(long num) {
        int count = 0;
        if (num == 1) return 0;
        else {
            while (num != 1 && count < 500) {
                if (num % 2 == 0)
                    num /= 2;
                else
                    num = num * 3 + 1;
                count++;
            }
            if (count >= 500)
                count = -1;
        }
        return count;
    }
}