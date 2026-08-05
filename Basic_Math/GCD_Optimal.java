public class GCD_Optimal {
    public static int gcommon_factor(int n1, int n2){
        for (int i =  Math.min(n1, n2); i > 0; i--) {
            if (n1%i==0 && n2%i==0) {
                return i;
            }
        }
        return 1;

    }

    public static void main(String[] args) {
        int n1 = 4;
        int n2 = 26;
        int result = gcommon_factor(n1, n2);
        System.out.print("GCD = "+result);
    }
}