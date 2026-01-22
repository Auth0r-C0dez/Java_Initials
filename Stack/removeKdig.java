// Problem Statement: Given a string nums representing a non-negative integer, and an integer k, 
// find the smallest possible integer after removing k digits from num.


// Algorithm
// Use a stack to store digits of the resulting number
// Iterate through each digit of the input string
// While the stack is not empty, the current digit is smaller than the top of the stack, and k is greater than 0,
//  pop from the stack and decrement k
// Push the current digit onto the stack
// If k is still greater than 0 after the iteration, remove digits from the end of the stack
// Collect the remaining digits from the stack to form the result
// Remove any leading zeroes from the result
// If the result is empty after removing zeroes, return "0"

import java.util.Stack;

class Solution {
    String removeKdigits(String nums, int k) {
        Stack <Character> st = new Stack<>();
        for (int i = 0; i < nums.length(); i++) {
            char digit = nums.charAt(i);
            while(!st.isEmpty() && k >0 && st.peek() > digit ) {
                st.pop();
                k--;
            }
            st.push(digit);
        }
        while(k>0) {
            st.pop();
            k--;
        }
        if(st.isEmpty()) return "0";
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()) {
            ans.append(st.pop());
        }
        while(ans.length()>0&&ans.charAt(ans.length() -1)=='0') {
            ans.deleteCharAt(ans.length()-1);
        }
        ans.reverse();

        if(ans.length()==0) return "0";
        return ans.toString();
    }
}

public class removeKdig {
    public static void main(String[] args) {
        String nums = "541892"; // Input number as string
        int k = 2; // Number of digits to remove

        // Create an instance of Solution class
        Solution sol = new Solution();

        // Call the function to find the smallest number after removing k digits
        String ans = sol.removeKdigits(nums, k);

        // Print the result
        System.out.println("The smallest possible integer after removing k digits is: " + ans);
    }
}
