// Problem Statement: Given a string, S. Find the length of the longest substring without repeating characters.

// Algorithm
// Initialize few variables as: l and r pointers to 0. These pointers will define the current window [l, r]
//  that contains characters without repetition, maxLen to 0 to store the maximum length of substring found 
//  without repeating character.
// Use an array hash of size 256 (assuming ASCII characters) to store the last occurrence index of each
//  character in the string. Initialize all elements of hash to -1, indicating that no characters have
//   been encountered yet.
// Now, while r pointer is less than sizeOfArray - 1, iterate in the array. While iterating, check if 
// current character has occured before using hash array. If so, updadate the left pointer to index of 
// current character plus 1. This ensures that l moves past the last occurrence of of repeated character,
//  effectively removing the repeated character from the window.
// Calculate the length of the current substring as len = r - l + 1. Update maximum length of the substring
//  found so far.
// Update hash array with the current index r, indicating the most recent occurrence of character at pointer
//  r in the string. Finally, return maximum length of the substring.

import java.util.Arrays;

class Solution {
    int longNoRepeatSubstring(String s) {
        int n = s.length();
        int l=0;
        int r=0;
        int maxl=0;
        int hasheng[] = new int[256];
        Arrays.fill( hasheng,-1);
        while(r<n) {
            if(hasheng[s.charAt(r)] >= 1) {
                l = Math.max(hasheng[s.charAt(r)]+1,l);
            }
            int len = r-l+1;
            maxl=Math.max(len,maxl);
            hasheng[s.charAt(r)]=r;
            r++;
        }return maxl;
    }
}
public class longestSubstring {
    public static void main(String[] args) {
        String s = "cadbzabcd";

        // Create an instance of the Solution class
        Solution sol = new Solution();

        int result = sol.longNoRepeatSubstring(s);

        // Output the maximum length
        System.out.println("The maximum length is:");
        System.out.println(result);
    }
}
