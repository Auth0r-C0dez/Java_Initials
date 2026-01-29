// Problem Statement: Given an integer k and a string s, any character in the string can be selected and 
// changed to any other uppercase English character. This operation can be performed up to k times. 
// After completing these steps, return the length of the longest substring that contains the same letter.

// Algorithm
// The key optimization over the previous sliding window method is to avoid shrinking the window. 
// Instead of always adjusting the window size based on the replacement condition, 
// we keep expanding the window as long as the current window satisfies the condition.
//  We don’t need to shrink the window manually because the maximum window size that satisfies 
//  the constraint can be tracked directly, as we are only asked for the maximum length, not the actual substring.

// hence, as we slide the window, we always try to increase the window size. We maintain the count of
//  the most frequent character in the current window. If the difference between the window size and this count
//   exceeds k, it means we need more than k replacements but instead of shrinking, we just continue checking and
//    computing the maximum valid length encountered.

// This approach avoids recalculating the maximum frequency on every iteration, making it faster than the 
// better approach.
// Initialize a frequency array or hashmap to store character frequencies in the current window.
// Track the count of the most frequent character seen so far in the window.
// For every character, expand the window by moving the right pointer.
// If (current window length - max frequency) exceeds k, it means more than k replacements are needed, 
// so we move the left pointer forward.
// Throughout the loop, update the max window length that satisfies the constraint.

class Solution {
    int characterReplce(String s, int k) {
        int[] freq= new int[26];
        int r=0;
        int l=0;
        int maxLen=0;
        int cnt=0;
        while(r<s.length()) {
            freq[s.charAt(r) - 'A']++;
            cnt= Math.max(cnt,freq[s.charAt(r) - 'A']);
            while((r-l+1)-cnt  > k){
                freq[s.charAt(l) - 'A']--;
                l++;
            }
            maxLen=Math.max(maxLen,r-l+1);
            r++;
        }
        return maxLen;

    }
}
public class longRepeatReplace {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "AABABBA";
        int k = 1;
        // Output: 4
        System.out.println(sol.characterReplce(s, k));
    }
}
