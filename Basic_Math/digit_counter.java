// package Basic_Math;
// import java.util.*;

public class digit_counter {

    public static int counting(int n){
        int cnt = 0;
        while(n>0){
            cnt++;
            n /=10;
        }
        return cnt;
    }
    public static void main(String[] args) {
        int N = 45654455;
        int o = counting(N);

        System.out.println("Cout = "+o);
    }
}
