package pla;

public class euclid {
    public static void main(String[] args) {
        int a = 20;
        int b = 99;
        System.out.println("GCD is " + gcd(a,b));
    }
    public static int gcd(int a , int b) {
        if(a==0) return b;
        return gcd(b%a, a);
    } 
}
