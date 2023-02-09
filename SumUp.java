Problem Statement
Given two integers a and b. Your task is to find the sum of all the even divisors of each number from a to b inclusive.
Input
The input contains two integers a and b.

Constraints:-
1 <= a <= b <= 108
Output
Print the sum of even divisors.
  
  
import java.io.*;

class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String[] input = sc.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        long sum = 0;
       for(int i=a; i <= b; i++){
        int temp=i;
        while(temp%2==0){
            sum += temp;
            temp /=2;
        }
            }
    System.out.println(sum);
    }
}
