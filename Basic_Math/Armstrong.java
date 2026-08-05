public class Armstrong {
    public static boolean armstrong(int n){
        int k = String.valueOf(n).length(); // Counts the no. of digits in the Interger; 100% accurate!
        int sum=0;
        int old = n;
        while (n>0) {
            int temp = n%10;
            sum += Math.pow(temp, k);
            n/=10;
        }
        return sum==old;
    }
    
    public static void main(String[] args) {
        int N = 153;
        int O = 54;
        boolean a = armstrong(N);
        boolean b = armstrong(O);
        System.out.println("Armstrong = "+a);
        System.out.println("Armstrong = "+b);
    }
}
