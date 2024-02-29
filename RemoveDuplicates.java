import java.util.*;
public class Recursion {
    public static void removeDuplicate(String str,int idx,StringBuilder newStr,boolean map[]) {
        //base case for recursiion
        if(idx==str.length()) {
            System.out.println(newStr);
            return;
        }
        //code besides recursion
        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true){
            //then the eleemnt is a duplicate
            removeDuplicate(str,idx+1,newStr,map);
        } else{
            map[currChar-'a'] =true;
            removeDuplicate(str,idx+1,newStr.append(currChar),map);
        }
       
    }
    public static void main (String args[]) {
      String str = "git and github";
      removeDuplicate(str,0,new StringBuilder(""),new boolean[85]);
    }
}
