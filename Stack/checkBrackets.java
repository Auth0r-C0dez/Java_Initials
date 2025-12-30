import java.util.Stack;
//Problem Statement: Check Balanced Parentheses. Given string str containing just the characters '(', ')', '{', '}', '[' and ']', check if the input string is valid and return true if the string is balanced otherwise return false. .
class Ans {
    public boolean isValid(String s) {
        Stack <Character> st = new Stack<>();
        for(char ch : s.toCharArray()) {
            if(ch == '(' ||ch == '['||ch =='{') {
                st.push(ch);
            }else {
                if(st.isEmpty()) return false;
                char top = st.pop();
                if(ch ==')' && top=='('|| ch==']'&&top=='['|| ch=='}' && top=='{') continue;
                else return false;
            }
        } return st.isEmpty();
    }
}
public class checkBrackets {
    public static void main (String[] args) {
        Ans sol = new Ans();
        String s = "()[{}()]";

        if (sol.isValid(s))
            System.out.println("True");
        else
            System.out.println("False");
    }
}
