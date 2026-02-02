// Problem Statement: You are given a binary array nums (containing only 0s and 1s) and an integer goal. 
// Return the number of non-empty subarrays of nums that sum to goal. A subarray is a contiguous part of 
// the array.

// Algorithm
// To count the number of subarrays with sum exactly equal to goal, a clever strategy is to reframe the problem:
//  We count the number of subarrays whose sum is at most goal, and subtract from it the number of subarrays whose
//   sum is at most goal- 1.

// This works because:The subarrays with sum exactly goal are the ones included in atMost(goal) but 
// not in atMost(goal - 1) and This is valid for non-negative elements.

// Why is this more efficient?
// Instead of recomputing subarray sums from scratch , we maintain a sliding window that expands and 
// contracts based on the current sum.This gives us linear time performance by moving each pointer at most once. 
// This method only works when goal ≥ 1, because the atMost(goal - 1) calculation is invalid for goal = 0 
// (negative index/window not possible).
// Define a helper function to calculate the number of subarrays with sum at most a given value
// Initialize a sliding window with two pointers (left and right)
// Iterate through the array, expanding the right pointer and adding to current sum
// If the current sum exceeds the target, shrink the window from the left until it’s valid
// At each step, add the size of the current valid window to the count
// To get the final answer, compute: atMost(goal) - atMost(goal - 1)

class Solution{
    int numSubarraysWithSum(int[]arr,int goal) {
        return (subArr(arr,goal) - subArr(arr,(goal-1)));
    }
    int subArr(int[]arr, int k) {
        if(k<0) return 0;
        int left = 0;
        int count = 0;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            while(sum>k) {
                sum-=arr[left];
                left++;
            }
            count +=(i-left+1);
        }
        return count;
    }
}

public class binSubarraySum {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 0, 1, 0, 1};
        int goal = 2;
        System.out.println(sol.numSubarraysWithSum(nums, goal)); // Output: 4
    }
}
