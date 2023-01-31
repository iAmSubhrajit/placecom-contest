Grid Magic (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given a square character grid of side length N (where N is odd). You have to find whether the given grid is magical or not. A grid is said to be magical if it contains the same character on each element in its diagonal. Moreover, all the elements that are not present on the diagonal have to have the same character (which is different than the one on the diagonal).
Input
The first line contains integer N.
Each of the next N lines contain N lowercase English latin characters.

Constraints:
3 <= N <= 500
N is odd.
Output
Print "YES" if the given grid is magical, else print "NO", without the quotes.
  
  
  import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] grid = new char[n][n];

        for(int i=0; i<n; i++){
            grid[i] = sc.next().toCharArray();
        }

        char diagonalChar = grid[0][0];
        char nonDiagonalChar = '\0';
        boolean isMagical = true;


        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i == j || i == n - j -1){
                    if(grid[i][j] != diagonalChar){
                        isMagical = false;
                        break;
                    }
                }else{
                    if(nonDiagonalChar == '\0'){
                        nonDiagonalChar = grid[i][j];
                    }else if(grid[i][j] != nonDiagonalChar){
                        isMagical = false;
                        break;
                    }
                }
            }
            if(!isMagical){
                break;
            }
        }
        if(diagonalChar == nonDiagonalChar){
            isMagical = false;
        }

        if(isMagical){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
