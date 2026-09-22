public class LCMoftwono {
    public static int lcm(int n1, int n2){
        int max = n1>n2 ? n1:n2;
        for (int i = max; ; i++) {
            if (i%n1==0 && i%n2==0) {
                return i;
            }
        }
    }
    public static void main(String[] args) {
        int n1 = 4;
        int n2 = 6;
        System.out.println(lcm(n1, n2));
    }
}
