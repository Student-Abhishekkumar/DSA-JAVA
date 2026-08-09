package Recursion;

class solution{
    public int recursive_loop(int n){
        if (n==0) {
            return 1;
        }

        return n*(recursive_loop(n-1));
    }
}

public class factorial_recursive {
    public static void main(String[] args) {
        solution s = new solution();

        int n = 5;
        System.out.println(s.recursive_loop(n));
    }
}
