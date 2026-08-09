package Recursion;

/**
 * Innernum_sum_brute
 */
class sum {
    public int number_sum(int n){
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum+=i;
        }

        return sum;
    }
}

public class num_sum_brute {
    public static void main(String[] args) {
        sum s = new sum();

        int n = 15;
        int result = s.number_sum(n);
        System.out.println(result);
    }    
}
