package pla;

public class karstuba {
    public static void main(String[] args) {
        int a = 12;
        int b = 34;
        int result = karatsuba(a,b);
        System.out.println("Result is " + result);
    }
    public static int karatsuba(int a , int b) {
        if(a< 10 || b< 10) {
            return a * b;
        }
        int size = Math.max(String.valueOf(a).length(),String.valueOf(b).length());
        int mid = size/2;
        int power = (int) Math.pow(10,mid);
        int a1 = a/power;
        int a2 = a% power;
        int b1 = b/power;
        int b2 = b%power;

        int Z1 = karatsuba(a1, b1);
        int Z2 = karatsuba(a2, b2);
        int Z3 = karatsuba(a1+a2,  b1+ b2);

        return(Z1 * (int)Math.pow(10,2*mid)) + ((Z3-Z1-Z2)*power) +Z2;
    }
}
