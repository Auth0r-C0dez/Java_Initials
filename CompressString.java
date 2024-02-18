import java.util.*;
public class Strings {
    
    public static String compress(String word) {//function for compressing string
    String newString= "";
    for(int i=0;i<word.length();i++) {
        Integer count =1;
        while(i<word.length()-1 && word.charAt(i) == word.charAt(i+1)) {//checking if the next letter is same
            count++;//if same thn count will increase
            i++;//index will increase
        }
        newString += word.charAt(i);//if not same thn new letter will b added 2 new string
        if(count >1 ) {//if new letter is more than 1
            newString += count.toString();//then we add it to count
        }
    }
    return newString;//finally the new string is returned
    }
    public static void main(String args[]) {
     String word="aaaabbsnsjskkksoeddd";
     System.out.println(compress(word));
    }
}
