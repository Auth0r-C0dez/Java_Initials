import java.util.*;
public class Recursion {
    public static int tilingProblem(int n) {
        //base case for recursion
        if(n==0|| n == 1) {
            return 1;
        }
        //for vertical tiling
       int fnM1 = tilingProblem(n-1);
       //for horizontal tiling
       int fnM2 = tilingProblem(n-2);

       int totalWays = fnM1 + fnM2;
       return totalWays;

    }
    public static void main (String args[]) {
       System.out.println(tilingProblem(10));
    }
}
