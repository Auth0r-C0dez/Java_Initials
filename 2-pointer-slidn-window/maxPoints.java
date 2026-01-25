// Problem Statement: Given N cards arranged in a row, each card has an associated score denoted 
// by the cardScore array. Choose exactly k cards. In each step, a card can be chosen either from 
// the beginning or the end of the row. The score is the sum of the scores of the chosen cards.


// Instead of trying all combinations by recalculating front and back sums each time, we use a 
// modified sliding window technique. We start by taking all k cards from the front, then gradually
//  shift the window by removing one card from the front and adding one from the back.
//   This keeps the number of selected cards fixed, but changes the selection balance between front and back
//   . At each step, we update the score in constant time, which makes the solution much faster than 
//   brute force.
// Calculate the sum of the first few elements from the start of the array, equal to the 
// total number of cards to be selected.
// Store this sum as the initial maximum possible score.
// Iterate from the end of this initial window, gradually removing one element from the end of
//  the current front window and adding one new element from the back of the array.
// This maintains the total number of selected cards but shifts the balance between front and back.
// After each shift, compare the new total score with the previously stored maximum and update the 
// maximum if the new score is higher.
// Repeat this process for as many shifts as there are cards to be picked.
// Return the highest score obtained after evaluating all possible combinations of selections from
//  the front and back.

class Solution {
    int maxScore(int[] card,int k) {
        int lmax=0;
        int tsum=0;
        int n = card.length;

        for (int i = 0; i < k; i++) {
            lmax += card[i];    
        }
        tsum=lmax;
        for (int i = 0; i < k; i++) {
            lmax -= card[k-1-i];
            lmax +=card[n-1-i];
            tsum = Math.max(tsum,lmax);
        }
        return tsum;

    }
}

public class maxPoints {
    public static void main(String[] args) {
        // Define card points and k
        int[] cards = {1, 2, 3, 4, 5, 6, 1};
        int k = 3;

        // Create object of Solution
        Solution sol = new Solution();

        // Print the result
        System.out.println(sol.maxScore(cards, k));
    }
}
