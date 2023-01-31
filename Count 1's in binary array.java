Count 1's in binary array
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a binary sorted non-increasing array arr of size N. You need to print the count of 1's in the binary array.

Try to solve the problem using binary search
Input
The input line contains T, denotes the number of testcases.
Each test case contains two lines. The first line contains N (size of binary array). The second line contains N elements of binary array separated by space.

Constraints:
1 <= T <= 100
1 <= N <= 10^6
arr[i] = 0,1

Sum of N over all testcases does not exceed 10^6
Output
For each testcase in new line, print the count 1's in binary array.
  
  
  
  import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int count = 0;
            for(int i=0;i<n;i++){
                if(arr[i]==1){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
