//Problem Statement: Design a stack that supports the following operations in constant time: push, pop, top, and retrieving the minimum element.

// Implement the MinStack class:

// MinStack(): Initializes the stack object.
// void push(int val): Pushes the element val onto the stack.
// void pop(): removes the element on the top of the stack.
// int top(): gets the top element of the stack.
// int getMin(): retrieves the minimum element in the stack.

import java.util.Stack;

class MinSt{
    private Stack <Integer> st;
    private int mini;
    MinSt() {
        st = new Stack<>();
    }
    public void push(int value) {
        if(st.isEmpty()) {
            mini = value;
            st.push(value);
            return;
        }
        if(value>mini) {
            st.push(value);
        } else {
            st.push(2*value-mini);
            mini = value;
        }
    }
    public void pop(){
        if(st.isEmpty()) return;
        int x = st.pop();
        if(x<mini) {
            mini = 2*mini-x;
        }
    }
    public int top() {
        if(st.isEmpty()) return -1;
        int x = st.pop();
        if(mini<x) return x;
        return mini;
    }
    public int getMin() {
        return mini;
    }
}

public class minStack {
    public static void main(String[] args) {
        MinSt s = new MinSt();
        s.push(-2);
        s.push(0);
        s.push(-3);
        System.out.print(s.getMin() + " ");
        s.pop();
        System.out.print(s.top() + " ");
        s.pop();
        System.out.print(s.getMin());
    }
}
