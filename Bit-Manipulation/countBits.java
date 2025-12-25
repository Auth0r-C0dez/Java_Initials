// Problem Statement: Given an integer n, return the number of set bits (1s) in its binary representation.
// Can you solve it in O(log n) time complexity?

// Algorithm
// Initialize a counter to zero.
// While the number is greater than zero:
// Check if the least significant bit (LSB) is 1 by performing bitwise AND with 1.
// If LSB is 1, increment the counter.
// Right shift the number by one bit.
// Return the counter.

public class countBits {
    public static void main(String[] args) {
        int num = 5;
        int bitz = counteng(num);
        System.out.println("number of bits are " + bitz);
        int algo = UsnAlgo(num);
        System.out.println("number of bits are " + algo);

    }
    private static int counteng(int n) {
        int cnt =0;
        while(n>0) {
            if((n&1) ==1) {
                cnt++;
            } n =n>>1;
        } return cnt;
    }

    //using Brian Kernighan’s Algorithm
    private static int UsnAlgo(int n) {
        int cnt = 0;
        while(n>0) {
            n = n & (n-1);
            cnt++;
        }return cnt;
    }
}
