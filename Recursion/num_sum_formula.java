package Recursion;

import java.util.Scanner;

class solution{
    public int sum(int n){
        return (n*(n+1)/2);
    }
}

public class num_sum_formula {
    public static void main(String[] args) {
        solution s = new solution();
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the Number : ");
        int n = sc.nextInt();

        System.out.println(s.sum(n));
        sc.close();
    }
}
