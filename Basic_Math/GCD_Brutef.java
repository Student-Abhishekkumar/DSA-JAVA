import java.lang.Math;

public class GCD_Brutef {
    public static int gcommon_factor(int n1, int n2){
        int gcd=1;
        for (int i = 1; i <= Math.min(n1, n2); i++) {
            if (n1%i==0 && n2%i==0) {
                gcd=i;
            }
        }
        return gcd;

    }

    public static void main(String[] args) {
        int n1 = 4;
        int n2 = 26;
        int result = gcommon_factor(n1, n2);
        System.out.print("GCD = "+result);
    }
}
