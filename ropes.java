Ropes (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
There are n ropes, you need to cut k pieces of the same length from them. Find the maximum length of the piece you can get.
Input
The first line of the input contains two integers n and k.
Next n lines contain one number each, the length of the rope ai.

Constraints
1 ≤ n, k ≤ 10000
1 ≤ ai ≤ 107
Output
Print one real number maximum length of the piece you can get. Print the result up to 6 decimal places.
Example
Sample Input
4 11
802
743
457
539

Sample Output
200.500000


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int k= sc.nextInt();
        double[] a = new double[n];

        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();

        }

        double l = 0, r = 1e9;

        while (r-1 > 0.000001){
            double mid = l + (r-l)/2;
            int piece = 0;

            for(int i =0; i<n; i++){
                piece += a[i] / mid;
            }
            if(piece >= k){
                l = mid ;
            }else{
                r = mid;
            }
        }

        System.out.printf("%0.6f", l);
    }
}
