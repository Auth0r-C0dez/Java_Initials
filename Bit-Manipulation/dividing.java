//Problem Statement: Given the two integers, dividend and divisor. Divide without using the mod, division, or multiplication operators and return the quotient.
//The fractional portion of the integer division should be lost as it truncates toward zero.

// Algorithm
// Determine the sign of the final result by checking if the dividend and divisor have opposite signs.
// Convert both numbers to positive using their absolute values to simplify the logic.
// To speed up division, subtract powers of two multiples of the divisor instead of subtracting it one by one.
// Use bit shifting to efficiently find the largest multiple of the divisor that fits into the remaining dividend.
// Subtract this multiple from the dividend and accumulate the equivalent power of two into the result.
// Repeat until the dividend becomes smaller than the divisor.
// Clamp the result to 32-bit signed integer limits if necessary to prevent overflow.
// Apply the correct sign to the result and return the final quotient.

public class dividing {
    public static void main(String[] args) {
        int divi = 29;
        int dive = 3;
        int quo = quotient(divi, dive);
        System.out.println("quotient is " + quo);

    }
    private static int quotient(int divi, int dive) {
        if(divi== dive) return 1;
        if(dive ==1 ) return divi;
        if(divi>Integer.MIN_VALUE && dive == -1) return Integer.MAX_VALUE;
        boolean sign = true;
        if(divi>=0 && dive<0){
            sign = false;
        }else if (divi<=0 && dive>0){
            sign = false;
        }
        long n = divi;
        long i = dive;
        n = Math.abs(n);
        i = Math.abs(i);
        long ans =0,sum=0;
        while(sum + i<n){
            ans++;
            sum+=i;
        }
        if(ans>Integer.MAX_VALUE && sign) return Integer.MAX_VALUE;
        if(ans>Integer.MAX_VALUE && !sign) return Integer.MAX_VALUE;

        return sign ? (int)ans : (int)(ans *-1);
    }
}
