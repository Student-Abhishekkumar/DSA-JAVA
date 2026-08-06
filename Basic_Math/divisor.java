import java.util.ArrayList;
import java.util.List;

public class divisor {
    public List<Integer> find_divisor(int n){
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n%i==0) {
                list.add(i);
            }
        }
        return list;
    }
    
    public static void main(String[] args) {
        divisor s = new divisor();
        int n = 36;
        List<Integer> result = s.find_divisor(n);
        System.out.print("Divisors of " + n + ": ");
        System.out.println(result);
    }
}
