public class reverse {
    public static int reverse_interger(int n){
        int reverse = 0;
        while (n>0) {
            int digit = n%10;

            if (reverse>Integer.MAX_VALUE / 10 || reverse == Integer.MAX_VALUE / 10 && digit>7) {
                return 0;
            }
            if (reverse<Integer.MIN_VALUE / 10 || reverse == Integer.MIN_VALUE / 10 && digit<-8) {
                return 0;
            }

            reverse=reverse*10+digit;
            n/=10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        int n = 6541;
        int out = reverse_interger(n);
        System.out.print("Reversed = "+out);
    }
}
