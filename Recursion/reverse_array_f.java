package Recursion;

class revrse{
    public int[] rev_arr(int[] arr){
        int n = arr.length;
        int[] new_arr = new int[n];

        for (int i = 0; i < n; i++) {
            new_arr[i] = arr[n-1-i];
        }
        return new_arr;
    }
}

public class reverse_array_f {
    public static void main(String[] args) {
        revrse rs = new revrse();
        
        int[] arr = {1,2,3,4,5};
        int[] rev = rs.rev_arr(arr);
        
        for(int reverse : rev){
            System.out.print(reverse+" ");
        }
    }
}
