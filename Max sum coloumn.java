Max sum column
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a matrix of size M*N, your task is to find the maximum sum of a column.
Input
The first line of input contains two space- separated integers M and N. The next M lines of input contains N space- separated integers each depicting the values of the matrix.

Constraints:-
1 <= M, N <= 100
1 <= Matrix[][] <= 100000
Output
Print the maximum sum between the columns.
  
  
  import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int matrix[][]= new int[M][N];
        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                matrix[i][j]= sc.nextInt();
              }
          }    
          long sum=0;
                for(int i=0; i<N; i++){
                    long sum1 = 0;
                    for(int j=0; j<M; j++)
                    sum1 +=matrix[j][i];
                    sum=Math.max(sum1,sum);
                }
            
        
        System.out.println(sum);
    }
}
