//Problem Statement: Given a circular integer array arr, return the next greater element for every element in arr.
// The next greater element for an element x is the first element greater than x that we come across while traversing the array in a clockwise manner.
// If it doesn't exist, return -1 for that element element.


// Initialize an answer array with default values of -1
// Initialize an empty stack to keep track of elements
// Traverse from 2n - 1 down to 0 using modulus to simulate circular indexing
// While stack is not empty and top of stack is less than or equal to current element, pop from stack
// If index is in the original array range, assign top of stack to answer if stack is not empty, else keep -1
// Push the current element onto the stack
// After traversal ends, return the answer array
import java.util.Stack;
class Solution {
    public int[] nextGen(int[] arr) {
        int n = arr.length;
        int[] res = new int[arr.length];
        Stack <Integer> st = new Stack<>();
        for(int i=2*n-1;i>=0;i--) {
            int ind = i%n;
            int currEl = arr[ind];
            while(!st.isEmpty() && st.peek()<=currEl) {
                st.pop();
            }
            if(i<n) {
                if(st.isEmpty()) {
                    res[ind] = -1;
                }else {
                    res[ind] = st.peek();
                }
            }
            st.push(currEl);

        }return res;
    }
}

public class nextGreatII {
    public static void main(String[] args) {
        int[] arr = {5, 7, 1, 7, 6, 0};

        // Create instance of Solution
        Solution sol = new Solution();
        int ans[] = sol.nextGen(arr);
        for(int x: ans) {
            System.out.print(x+" ");
        }System.out.println();
    }
}
