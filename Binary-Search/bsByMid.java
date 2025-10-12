package BinarySearch;

public class bsByMid {
    public static void main(String[] args) {
        int[] a = {3, 4, 6, 7, 9, 12, 16, 17};
        int target = 6;
        int ind = binarySearch(a, target);
        if (ind == -1)
            System.out.println("The target is not present.");
        else
            System.out.println("The target is at index: " + ind);
    }
    public static int binarySearch(int[]arr,int target) {
        int n = arr.length;
        int start = 0;
        int end = n-1;
        while(start<=end) {
            int mid = (start+end)/2;
            if(arr[mid] ==target) return mid;
            else if(target>arr[mid]) start = mid+1;
            else end = mid-1;
        }
        return -1;
    }
}
