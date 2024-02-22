import java.util.*;
public class Recursion {
    public static int FirstOccurance(int array[],int i,int element) {
       if(i == array.length) {
        return -1;
       }
       if(array[i] == element) {
        return i;
       }
       return FirstOccurance(array,element,i+1);       
    }
    public static void main (String args[]) {
        int array[] ={5,4,7,8,12,1,3,4,0,2,3,4,5,6};
        System.out.println(FirstOccurance(array,0,5));
    }
}
