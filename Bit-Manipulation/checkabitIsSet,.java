//Problem Statement: Given two integers n and i, return true if the ith bit in the binary representation of n (counting from the least significant bit, 0-indexed) is set (i.e., equal to 1).
//otherwise return false
public class checkabitIsSet {
    public static void main(String args[]) {
        int num = 5;
        int bitIn = 2;
        System.out.println(checkgivenBit(num, bitIn));

    }
    private static boolean checkgivenBit(int num,int bitIn) {
        return (num & (1 << bitIn)) !=0;
    }
}
