import java.util.*;
public class Recursion {
    public static int pairs(int n) {
      //base case
      if(n ==1 || n ==2) {
        return n;
      }
      
      //recursion code
      //if the item is kept single
      int fnm1 = pairs(n-1);

      //if the items are paired
      int fnm2 = pairs(n-2);
      int pairways =(n-1) * fnm2;

      //total number of ways are
      int totalways = fnm1 + pairways;
      return totalways;
    }
     
    public static void main (String args[]) {
        System.out.println(pairs(3));
      
    }
}
