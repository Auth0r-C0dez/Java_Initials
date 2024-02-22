import java.util.*;
public class Recursion {
    public static int fibonacci(int n) {
        if (n ==0 || n == 1){
            return n ;
        }
        int fNm1 = fibonacci(n - 1);
        int fNm2 = fibonacci(n-2);
        int fn = fNm1 + fNm2;
        return fn;
        
    }
    public static void main(String args[]) {
        int n = 7;
        System.out.print(fibonacci(n));
    }
}
