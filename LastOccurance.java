import java.util.*;
public class Recursion {
    public static int LastOccurance(int array[],int i,int element) {
       if(i == array.length) {
        return -1;
       }
      int isfound = LastOccurance(array,i+1,element);
      if(isfound == -1 && array[i] == element) {
        return i;
      }       
      return isfound;
    }
    public static void main (String args[]) {
        int array[] ={5,4,7,8,12,1,3,4,0,2,3,4,5,6};
        System.out.println(LastOccurance(array,0,5));
    }
}
