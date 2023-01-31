Problem Statement
Given two integers a and b. Your task is to find the sum of all the even divisors of each number from a to b inclusive.
Input
The input contains two integers a and b.

Constraints:-
1 <= a <= b <= 108
Output
Print the sum of even divisors.
  
  
  import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
   

    public static void main (String[] args) {
        BufferReader sc = new BufferReader(new InputStreamReader(System.in));
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = 0 ;

        for(int i=a; i <= b; i++){
            for(int j = i; j > 1; j= j/2 ){
               if(j % 2 == 0){
                if( i % j == 0 ){
                    sum += j;
                }
               }
            }
        }   
        System.out.println(sum);
    }
}
