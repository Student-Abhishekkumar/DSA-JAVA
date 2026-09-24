package array;

public class Largestelement {
    public static int largest(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {48,5,185,65,2,-51};
        int result = largest(arr);
        System.out.println(result);
    }
}
