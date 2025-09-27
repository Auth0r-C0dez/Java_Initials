package arrays;

public class checkSort {
    public static void main(String[] args) {
        int arr[] = {3,4,5,1,2};
        System.out.println("the given array is  " + checkisSorted(arr));
    }
    public static boolean checkisSorted(int arr[]) {
        boolean ascending=true;
        boolean descending = true;
        for(int i=0;i<arr.length-1;i++) {
            if(arr[i]>arr[i+1] ) {
                ascending = false ;
            }
            else if( arr[i]<arr[i+1]){
                descending = false;
            }
            
        }
        if(ascending) return ascending;
else if(descending) return descending;
else return false;
    }
}
