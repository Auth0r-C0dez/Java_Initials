package pla;


public class combination {
    public static void main (String[] args ) {
        String s = "ABCD";
        int n = s.length();
        int r = 3;
        int result = fact(n)/fact(r) * fact(n-r);
        System.out.println("Number of combinations is " + result);
    }
    public static int fact(int n) {
        if(n==1 || n==0) {
            return 1;
        }
        return n*fact(n-1);
    }
}
