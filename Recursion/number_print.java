package Recursion;

/**
 * Innernumber_print
 */
class num_print_recursion{
    public void print_num(int cnt, int n){
        if (cnt > n) {
            return;
        }
        print_num(cnt, n-1);
        System.out.println(n);
    }
}

public class number_print {
    public static void main(String[] args) {
        num_print_recursion np = new num_print_recursion();

        int n = 5; 
        np.print_num(1, n);
    }    
}
