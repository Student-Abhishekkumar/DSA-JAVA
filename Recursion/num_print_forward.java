package Recursion;

class Main {
    public void forward_print(int cnt, int n){
        if (cnt > n) {
            return;
        }
        System.out.println(cnt);
        forward_print(cnt + 1, n);
    }
}

public class num_print_forward {
    public static void main(String[] args) {
        Main nn = new Main();

        int n = 5;
        nn.forward_print(1, n);
    }
}
