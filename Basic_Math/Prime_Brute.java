public class Prime_Brute {
    public static boolean prime(int n){
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (n%i==0) {
                cnt++;
            }
        }
        return cnt==2;
    }

    public static void main(String[] args) {
        int n = 71;
        boolean rs = prime(n);
        System.out.println("N : "+rs);
    }
}
