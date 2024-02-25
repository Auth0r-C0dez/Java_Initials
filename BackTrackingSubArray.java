import java .util.*;
public class BackTracking {
    public static void findSubsets(String str,String ans, int i) {
        //base case 
        if(i == str.length()) {
            if(ans.length() ==0) {
                System.out.println("phi");
            } else {
                System.out.println(ans);
            }
            return;
        }

        //if the element of the string joins
        findSubsets(str,ans+str.charAt(i),i+1);

        //if the element of the string doesnt join
        findSubsets(str,ans,i+1);
    }
   
    public static void main(String args[]) {
        String str = "abc";
        findSubsets(str,"",0);
    }
}
