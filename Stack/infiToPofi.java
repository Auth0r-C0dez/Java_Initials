//Problem Statement: Given an infix expression, Your task is to convert the given infix expression to a postfix expression.

import java.util.*;

class Solution {
    public int precedence(char c) {
        if(c== '^') {
            return 3;
        }else if(c == '*' || c == '/' ){
            return 2;
        } else if(c == '+'|| c=='-') {
            return 1;
        }else {
            return -1;
        }
    }
    public void infixToPostfix(String s) {
        Stack <Character> st = new Stack<>();
        StringBuilder result = new StringBuilder();
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)) {
                result.append(c);
            }else if(c == '(') {
                st.push('(');
            }else if (c ==')') {
                while(!st.isEmpty()&&st.peek()!='(') {
                    result.append(st.pop());
                }
                st.pop();
            } else {
                while(!st.isEmpty() && precedence(c)<=precedence(st.peek())) {
                    result.append(st.pop());
                }
                st.push(c);
            }
        }
        while(!st.isEmpty()) {
            result.append(st.pop());
        }
        System.out.println("POstfix expression is " +result.toString());
    }
}
public class infiToPofi {
    public static void main(String[] args) {
        Solution s = new Solution();
        String exp = "(p+q)*(m-n)";  // Infix expression
        System.out.println("Infix expression: " + exp);
        s.infixToPostfix(exp); 
    }
}
