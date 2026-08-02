package Basic_Math;

public class optimal_digitcounter {
    public static int counter(int n){
        int cnt = (int) (Math.log10(n)+1);
        return cnt;
    }
    
    public static void main(String[] args) {
        int N = 55;
        int out = counter(N);
        System.out.println("Count = "+out);
    }
}
