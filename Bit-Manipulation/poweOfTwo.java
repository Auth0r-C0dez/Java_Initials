public class powerOFTwo {
    public static void main(String[] args) {
        int num = 6;
        System.out.println(chicking(num));
    }
    private static boolean chicking(int n ) {
        return n>0 && (n&(n-1)) ==0;
    }
}
