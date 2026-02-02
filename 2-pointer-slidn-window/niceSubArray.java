// Problem Statement: Given an array nums and an integer k. An array is called nice if and only if it contains
//  k odd numbers. Find the number of nice subarrays in the given array nums.
//   A subarray is continuous part of the array.

// We can't directly count subarrays with exactly K odd numbers using one pass of sliding window. 
// But we can count how many subarrays have at most K odd numbers. If we do this for both K and K-1, 
// then the difference gives us the number of subarrays that have exactly K odd numbers. 
// This works because: countExactlyK = countAtMost(K) - countAtMost(K - 1).
// Use a helper function to count the number of subarrays with at most a given number of odd numbers.
// Initialize two pointers to define the sliding window.
// Expand the window by moving the right pointer.
// If the number of odd numbers in the window exceeds the allowed count, move the left pointer to shrink the window.
// For each valid window, the number of subarrays ending at the current index is (right - left + 1).
// Repeat for K and K - 1, then return their difference.

class Solution {
    int numberOfSubarrays(int[]arr, int lim) {
        return (countn(arr,lim)-countn(arr,(lim-1)));
    }
    int countn(int[]arr,int k) {
        int left=0;
        int cnt=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] %2 !=0) k--;
            while(k<0) {
                if(arr[left] %2 !=0) {
                    k++;
                }left++;
            }
            cnt+=(i-left+1);
        }return cnt;
    }
}

public class niceSubArray {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 1, 2, 1, 1};
        int k = 3;
        System.out.println(sol.numberOfSubarrays(nums, k));
    }
}
