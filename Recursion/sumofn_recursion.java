package Recursion;

class solution{
    public  int sum(int n){
        if (n==1) {
            return 1;
        }

        return n + sum(n-1);
    }
}

public class sumofn_recursion {
    public static void main(String[] args) {
        solution s = new solution();

        int n = 6;
        System.out.println(s.sum(n));
    }
}
