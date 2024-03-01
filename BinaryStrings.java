import java.util.*;
public class Recursion {
    public static void printBinString(int n,int lastPlace,String str) {
        //base case for recursion
        if(n==0) {
            System.out.println(str);
            return;
        }
        //code for recursion
        printBinString(n-1,0,str+"0") ;

        if(lastPlace ==0 ) {
            printBinString(n-1,1,str+"1");
        }
    }
     
    public static void main (String args[]) {
        printBinString(3,0,"");
      
    }
}
