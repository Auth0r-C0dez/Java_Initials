// Problem Statement: Given a string s , consisting only of characters 'a' , 'b' , 'c'.
// Find the number of substrings that contain at least one occurrence of all these characters 'a' , 'b' , 'c'.

// Algorithm
// Instead of checking every possible substring, we use the sliding window technique. 
// We maintain a window [left, right] such that it contains at least one of each character 'a', 'b', and 'c'. 
// Once we get such a window, any substring that starts at or before left and ends at right will also be valid.
//  So we can add left + 1 to the result for each valid right. This avoids rechecking every substring and reduces
//   unnecessary checks.
// Initialize a result counter to store the total number of valid substrings.
// Maintain a hash map or frequency array to track the count of each character 'a', 'b', and 'c' in the current window.

// Initialize a left pointer to 0. We'll use it to track the start of the sliding window.
// Iterate through the string using a right pointer from 0 to the end of the string
// For each character at the right pointer, increment its count in the frequency map.

class Solution {
    int numberOfSubstrings(String s) {
        int freq[] = new int[3];
        int left=0;
        int cnt =0;
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)-'a']++;
            while(freq[0]>0 && freq[1]>0 && freq[2]>0) {
                cnt+=(s.length()-i);
                freq[s.charAt(left)-'a']--;
                left++;
            }
        }
        return cnt;
    }
}

public class abcSubstring {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "abcabc";
        System.out.println(sol.numberOfSubstrings(s));
    }
}
