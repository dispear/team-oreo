public class N76501음양더하기 {
    public static void main(String[] args) {
        /* 테스트
        int[] a = {4, 7, 12};
        boolean[] b = {true, false, true};
        System.out.println(solution(a, b));*/
    }

    public static int solution(int[] absolutes, boolean[] signs) {
        int result = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if (!signs[i])
                absolutes[i] *= -1;
            result += absolutes[i];
        }
        return result;
    }
}