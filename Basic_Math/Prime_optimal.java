public class Prime_optimal {
    public static boolean optimal_prime_check(int n){
        int cnt = 0;
        for (int i = 1; i*i <= n; i++) {
            if (n%i==0) {
                cnt++;
                if (i!=n/i) {
                    cnt++;
                }
            }
        }
        return cnt==2;
    }

    public static void main(String[] args) {
        int val = 17;
        boolean rs = optimal_prime_check(val);
        if (rs) {
            System.out.println("It is a Prime");
        }else{
            System.out.println("It is not a Prime Number");
        }
    }
}
