// Problem Statement: There is only one row of fruit trees on the farm, oriented left to right.
//  An integer array called fruits represents the trees, where fruits[i] denotes the kind of fruit produced by 
//  the ith tree.
// The goal is to gather as much fruit as possible, adhering to the owner's stringent rules :

// There are two baskets available, and each basket can only contain one kind of fruit. The quantity of fruit each 
// basket can contain is unlimited.
// Start at any tree, but as you proceed to the right, select exactly one fruit from each tree, including the 
// starting tree. One of the baskets must hold the harvested fruits.
// Once reaching a tree with fruit that cannot fit into any basket, stop.
// Return the maximum number of fruits that can be picked.

class Solution {
    int totalFruit(int[] arr) {
        int lastf=-1;
        int secLastF = -1;
        int curr=0;
        int maxL=0;
        int lastStreak =0;

        for(int fruit: arr) {
            if(fruit == lastf || fruit == secLastF) {
                curr++;
            }else {
                curr= lastStreak+1;
            }
            if(fruit==lastf) {
                lastStreak++;
            }else {
                lastStreak=1;
                secLastF=lastf;
                lastf=fruit;
            }
            maxL= Math.max(maxL,curr);
        }return maxL;
    }
}

public class fruitsInBasket {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] fruits = {1,2,1,2,3};
        System.out.println(sol.totalFruit(fruits));
    }
}
