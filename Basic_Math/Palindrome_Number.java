public class Palindrome_Number {
        public static boolean reverse_interger(int n){
        int dup = n;
        int reverse = 0;
        while (n>0) {
            int digit = n%10;
            reverse=reverse*10+digit;
            n/=10;
        }
        return dup==reverse;
    }

    public static void main(String[] args) {
        int n = 564;
        int a = 555;
        boolean out1 = reverse_interger(n);
        boolean out2 = reverse_interger(a);
        System.out.println("Reversed = "+out1);
        System.out.print("Reversed = "+out2);
    }
}
