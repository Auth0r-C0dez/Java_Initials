//Problem Statement: Given two integers a and b, swap them in-place using only 2 variables (without using a temporary variable).

// Algorithm
// Use the XOR (^) operator to swap two integers without a temporary variable.
// Set a = a ^ b. This updates a to store the XOR of both values.
// Set b = a ^ b. This changes b to the original value of a.
// Set a = a ^ b. This updates a to the original value of b.
// This technique works due to XOR properties: x ^ x = 0 and x ^ 0 = x.

public class swapeng {
    public static void main(String[] args) {
        int a = 6;
        int b = 5;
         a = a ^ b;
         b = a ^ b;
         a = a ^ b;
        System.out.println(a);
        System.out.println(b);
    }
     
}
