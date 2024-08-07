
public class 하샤드_수 {
    public boolean solution(int x) {
        int a=0, b=x;

        while(x>0) {
            a += b%10;
            b = b/10;
        }

        return x%a==0;
    }
}