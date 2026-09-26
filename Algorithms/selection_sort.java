package Algorithms;

class solution{
    public int[] selectionsort(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            int min = i;

            for (int j = i+1; j < nums.length; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }

            int temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;
        }
        return nums;
    }
}
public class selection_sort {
    public static void main(String[] args) {
        solution sol = new solution();
        int[] nums = {32,5,32,8,665,4};
        sol.selectionsort(nums);

        for(int val:nums){
            System.out.print(val + " ");
        }
    }
}
