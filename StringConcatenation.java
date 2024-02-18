import java.util.*;
public class Strings {
    public static void letters(String fulname) {
        for(int i=0;i<fulname.length();i++) {
            System.out.print(fulname.charAt(i)+ " ");
        }
       
    }
    public static void main(String args[]) {
        //concatenation of string means adding 2 strings
        String Fname = "Git";
        String Lname = "hub";
        String fulname = Fname + " " + Lname;
        System.out.println(fulname);//for merging the strings
        System.out.println(fulname.charAt(0));//for printing the character at the first index
        letters(fulname);
    }
}
