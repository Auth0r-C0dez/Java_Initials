import java.util.*;
public class Recursion{
    public static void decending (int n) {
        if (n==1) {
            System.out.println(n);
            return ;
        }
        System.out.print(n + " ");
        decending(n-1);
    }
    public static void main(String args[]) {
       int n = 20;
       decending(n);
    }
}
