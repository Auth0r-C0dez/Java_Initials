import java.util.*;
public class Strings {
    //substrings r the continuous part of a string
    public static String substring(String word,int starti,int endi) {//function for creating a substring
        String Sstring="";
        for(int i=starti;i<endi;i++) {
            Sstring += word.charAt(i);
        }
        return Sstring;
       
    }
    public static void main(String args[]) {
       String word = "soSweeet";
       System.out.println(word.substring(0,3));//using the inbuit method
        System.out.println(substring(word,0,3));//using the logical method
    }
}
