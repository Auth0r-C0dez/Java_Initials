package arrays;

public class missingNum {
    public static void main(String args[]) {
        int N = 5;
        int a[] = {1, 2, 4, 5};

        int ans = missingNumber(a, N);
        System.out.println("The missing number is: " + ans);
    }
    public static int missingNumber(int[] arr, int num) {
        int sum = (num*(num+1))/2;
        int s=0;
        for(int i=0;i<arr.length;i++) {
            s=s+arr[i];
        }
        return (sum-s);
    }
    
}
