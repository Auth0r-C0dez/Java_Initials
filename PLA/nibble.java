package pla;

public class nibble {
    public static void main(String[] args) {
        int n = 100;
        int left = (n&0x0F) << 4; //0x0F zeros out the left part only keeping the right part
        int right =(n>> 4);
        int r = left | right;
        System.out.println(r);
    }
    
}
