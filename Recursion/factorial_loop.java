package Recursion;
/**
 * Innerfactorial_loop
 */

class solution{
    public int loop(int n){
        int ans = 1;

        for (int i = 1; i <= n ; i++) {
            ans*=i;
        }
        
        return ans;
    }
}

public class factorial_loop {
    public static void main(String[] args) {
        solution s =new solution();

        int n = 5;
        System.out.println(s.loop(n));
    }
}
