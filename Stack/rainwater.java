//Problem Statement: Given an array of non-negative integers representation elevation of ground. Your task is to find the water that can be trapped after rain .

class Solution {
    public int waterAmount(int[] height) {
        int n = height.length;
        int lftMax = 0;
        int riMax = 0;
        int water = 0;
        int lft = 0 ;
        int ri8 = n-1;

        while(lft<=ri8) {
            if(height[lft]<=height[ri8]) {
                if(height[lft]>=lftMax) {
                    lftMax= height[lft];
                } else {
                    water += lftMax - height[lft];
                } lft++;

            } else {
                if(height[ri8]>=riMax) {
                    riMax = height[ri8];
                } else {
                    water += riMax - height[ri8];
                }
                ri8--;
            }
        } return water;
    }
}

public class rainwater {
    public static void main(String[] args) {
        // Input elevation map
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        
        // Create Solution object
        Solution sol = new Solution();
        int result = sol.waterAmount(height);
        
        // Print the result
        System.out.println("Trapped Rainwater: " + result);
    }
}
