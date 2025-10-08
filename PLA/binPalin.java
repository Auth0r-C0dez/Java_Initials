package pla;
import java.util.Scanner;
public class binPalin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int n = sc.nextInt();
        String bn = Integer.toBinaryString(n);
        int start = 0;
        int end = bn.length()-1;
        boolean isPalindromez = true;
        while(start<end) {
            if(bn.charAt(start) != bn.charAt(end)) {
                isPalindromez = false;
            }
            start++;
            end--;
        }
        if(isPalindromez){
            System.out.println(n+" is palindrome");
        }else {
            System.out.println(n+" is not a palindrome");
        }
        sc.close();
    }
}
