import java.util.*;
class ArrayStack {
    private int[] stackArray;
    private int capacity;
    private int topIndex;

    ArrayStack(int size) {
        capacity = size;
        stackArray = new int[capacity];
        topIndex = -1;
    }
    ArrayStack() {
        this(1000);
    }
    public boolean isEmpty() {
        return topIndex ==-1;
    }
    public void push(int x) {
        if(topIndex >= capacity -1) {
            System.out.println("stack overflow");
            return;
        }
        stackArray[++topIndex] =x;
    }
    public int pop() {
        if(isEmpty()) {
            System.out.println("Khali hai");
            return -1;
        }return stackArray[topIndex--];
    }
    public int top() {
        if(isEmpty()) {
            System.out.println("stack is empty");
            return -1;
        }return stackArray[topIndex];
    }

}

public class impWidArr {
    
    public static void main(String[]args) {
        ArrayStack stack = new ArrayStack();
        stack.push(7);
        stack.push(8);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack.top());



    }
}
