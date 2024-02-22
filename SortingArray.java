import java.util.*;
public class Recursion {
    public static boolean check(int array[],int i) {
        if(i==array.length-1) {
            return true;
        }
        if(array[i] > array[i+1]) {
            return false;
        }
        return check(array,i+1);
    }
    public static void main (String args[]) {
        int array[] ={1,2,3,4,5,6};
        System.out.println(check(array,0));
    }
}
