import java.util.*;
public class Recursion{
    public static int fact (int n) {
       if(n==0) {
        return 1;
       }
       int fNm1=fact(n-1);
       int fN = n * fact(n-1);
       return fN;
    }
    public static void main(String args[]) {
       int n = 5;
       System.out.print(fact(n)) ;
    }
}
