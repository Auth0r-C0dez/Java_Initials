//total numbers of pairs from all the elements in an array if there r n number of elements in an array then pairs are n(n-1)/2.
//for printing pairs of an array the time complexity O(N^2).

import java.util.*;
public class array{
public static void pair(int numbers[]) {//function is defined for printing elements in array
    int tp = 0;//total pair is initalised as 0
    for(int i=0; i<numbers.length;i ++) {
        int curr = numbers[i];
        
        for(int j=i+1; j<numbers.length;j++) {
                        System.out.print("(" + curr + "," + numbers[j] + ")");
            tp++;
        }
        System.out.println();//bracket is left empty for going to the next line for the next set of pair
    }
    //tp gives the number of pairs that will form.
     System.out.println("total pairs  : " + tp);//here the value of tp is obtained by the number of times the loop runs.
   }
    public static void main (String args[]) {
        int numbers[] = {1,2,3,4,5};//array is declared
        System.out.println("The pairs are :");
        pair(numbers);//function is called with array as arg
    }
}
