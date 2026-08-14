package Recursion;

class better_rev{
    public int[] rev_arr(int[] arr){
        int p1 = 0;
        int p2 = arr.length-1;

        while (p1!=p2) {
            int temp = arr[p1];
            arr[p1]=arr[p2];
            arr[p2]=temp;

            p1++;
            p2--;
        }
        return arr;
    }
}

public class rev_array_better {
    public static void main(String[] args) {
        better_rev br = new better_rev();
        
        int[] arr = {1,2,3,4,5};
        br.rev_arr(arr);

        for(int reverse : arr){
            System.out.print(reverse+" ");
        }

    }
}
