//Problem Statement: Given an integer array A, return the next greater element for every element in A. 
// The next greater element for an element x is the first element greater than x that we come across while traversing the array in a clockwise manner. 
// If it doesn't exist, return -1 for this element.

import java.util.Stack;

class Solution {
    public int[] greater(int[] nums) {
        Stack <Integer> st = new Stack<>();
        int n = nums.length;
        int arr[] = new int[n];
        for(int i = n-1;i>=0;i--) {
            while(!st.empty() && st.peek()<=nums[i]) {
                st.pop();
            }
            if(st.isEmpty()) arr[i] =-1;
            else {
                arr[i] = st.peek();
            }
            st.push(nums[i]);
        }return arr;
    }
}
public class nextGreat {
    public static void main(String[] args) {
        int[] nums = {4, 5, 2, 10};
        Solution sol = new Solution();
        int[] ans = sol.greater(nums);
        for(int x: ans) {
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
