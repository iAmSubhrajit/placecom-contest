/ Zero Padding(Contest)

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long p = sc.nextLong();
        
        long outer = (n + p + p) * (n + p + p);
        long inner = n*n;

        long ans = outer - inner;
        System.out.println(ans);
    }
}

