There is a row of N shops. Each shop sells A[i] candies. Your friend made an array B of (N-1) integers where B[i] = max(A[i], A[i+1]) for i from 1 to (N-1). You are given array B. You want to generate the array A such that the sum of values of the candies in A is maximum. Find the maximum possible sum of candies of array A.
Input
First line of input contains a single integer N.
Second line of input contains (N-1) integers denoting array B.

Constraints:
2 <= N <= 100000
1 <= B[i] <= 1000000000



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class Main {
    
        // Your code here
     static long maximumCandies(int[] b) {
        int n=b.length+1;
        int[] a = new int[n];
        a[0] = b[0];
        for (int i = 1; i < n-1; i++) {
            
            a[i]= Math.min(b[i-1], b[i]);
        }
        a[n-1]=b[n-2];
        long sum =0;
        for(int i=0; i<n;i++){
            sum+=a[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            b[i] = sc.nextInt();
        }
        System.out.println(maximumCandies(b));
    }
}

