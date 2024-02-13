//a code for finding the maximum sum of sub arrays from a given array
//this algorithm is only valid when all the given numbers in an array are not negative.
import java.util.*;//inport header file is used to import al the funtions methods etc.

public class array {
    public static void kadans(int numbers[]) {
        int ms = Integer.MIN_VALUE;//minimum sum is taken as -infinity
        int cs=0;//here current sum is 0
        for(int i=0;i<numbers.length;i++) {
            cs= cs +numbers[i];
            if(cs<0) {
                cs = 0;
            }
            ms=Math.max(cs,ms);//using the inbuilt method to take the maximum of 2 values
        }
        System.out.println("our max sum is " + ms);//printing the maximum sum of sub array
    }

    public static void main (String args[]) {
     int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
     kadans(numbers);//calling the kadans funcction
    }
}
