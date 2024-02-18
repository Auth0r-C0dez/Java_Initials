import java.util.*;
public class Strings {
    
    public static String Lcase2Ucase(String word) {//function for coverting Lcase to Ucase
    StringBuilder sb = new StringBuilder("");//string builder is initialised with an empty string
    char ch = Character.toUpperCase(word.charAt(0));
    sb.append(ch);

    for(int i =1;i<word.length();i++) {
        if(word.charAt(i)==' ' && i<word.length()-1) {//checking if there is an empty space
            sb.append(word.charAt(i));
            i++;
            sb.append(Character.toUpperCase(word.charAt(i)));//chapitalising the next word after space
        } else {
            sb.append(word.charAt(i));//just copying the word as it is after the capital letter
        }
    }
    return sb.toString();//string builder is converted again to string
       
       
    }
    public static void main(String args[]) {
     String word="i am at git hub";
     System.out.println(Lcase2Ucase(word));
    }
}
