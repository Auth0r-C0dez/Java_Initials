import java.util.*;
public class Strings {
    public static boolean palindrome(String test) {
        
        for(int i=0;i<test.length()/2;i++) {
            int n = test.length();
            if(test.charAt(i) != test.charAt(n-1-i)) {
                //not a palindrome
                return false;
            }
        }
        return true;
       
    }
    public static void main(String args[]) {
        String test = "racecar";
        System.out.print(palindrome(test));
        
    }
}
