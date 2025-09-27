package arrays;

public class findLargest {
    public static void main(String[] args) {
        int arr[] = {2,5,1,3,0};
        System.out.println("2nd largest number in the array is " + largestnum(arr));
    }
    public static int largestnum(int arr[]) {
        int max = arr[0];
        int max2 = -1;
        for(int i=1;i<arr.length;i++) {
            if(arr[i] > max) {
                max2=max;
                max=arr[i];
            }else if(arr[i]<max && arr[i]>max2) {
                max2=arr[i];

            }

        }
        
        

        return max2;
    }
}
