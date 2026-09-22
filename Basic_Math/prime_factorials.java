public class prime_factorials {
    
    public static int primenotoN(int n){
        int cnt = 0;
        for (int i = 2; i <= n; i++) {
            int fac = 0;
            for (int j = 2; j <= i; j++) {
                if (i%j == 0) {
                    fac++;
                }
            }
            if (fac == 1) {
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        int a = 6;
        int result = primenotoN(a);
        System.out.println(result);
    }
}
