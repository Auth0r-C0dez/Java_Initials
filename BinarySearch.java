//code for binary search in an array
//Binary search is used in sorted arrays only.
import java.util.*;//import file
public  class array {
    public static int binarysearch(int numbers[],int key) {//function with array as arg
        int start=0;
        int end = numbers.length-1;//here end is given value of -infinity
        while(start <= end) {
            int mid = (start + end) /2;
            //code for comparisions
            if(numbers[mid] ==key) {
                return mid;
            }
            if(numbers[mid] < key) {//this will check the right side of the array
                start = mid+1;
            } else {
                end = mid -1;
            }
        }
         return -1;//if the key doesnt exist in the array
    }
    public static void main(String args[]) {
        int numbers [] = {2,3,4,5,6,7,8};
        int key = 9;//the number that is to be searched within an array.
        System.out.print("index is " + binarysearch(numbers,key));//function is clled
    }
}
//in binary search the time complexity is always of log(n) .
// binary search code takes less time complexity than linear search.
