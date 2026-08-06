import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class divisor_optimal {
    public List<Integer> optimal_divisor(int n){
        List<Integer> collect = new ArrayList<>();
        for (int i = 1; i*i <= n; i++) {
            if (n%i==0) {
                collect.add(i);
                
                if (i!=n/i) {
                    collect.add(n/i);
                }
            }
        }
        Collections.sort(collect);
        return collect;
    }
    
    public static void main(String[] args) {
        divisor_optimal ds = new divisor_optimal();
        int n = 36;
        List<Integer> result = ds.optimal_divisor(n);
        System.out.print(n+": ");
        System.out.println(result);
    }
}
