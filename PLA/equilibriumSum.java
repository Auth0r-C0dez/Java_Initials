package pla;

public class equilibriumSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        int maxSum = getMaxEquilibriumSumOptimized(arr);
        System.out.println("Max Equilibrium Sum : " + maxSum);
    }
    

    public static int getMaxEquilibriumSumOptimized(int[] arr) {
        int total = 0;
        int left = 0;
        int max = Integer.MIN_VALUE;
        for(int x : arr) {
            total += x;
        }
        for(int i=0;i<arr.length;i++) {
            total -= arr[i];
            if(left == total ) {
                max = left;
            }
            left +=arr[i];
        }
        return max;
    }
}
