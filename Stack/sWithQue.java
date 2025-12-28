import java.util.*;
 class Qstack{
    Queue <Integer> q = new LinkedList<>();

    public void push(int x) {
        int s = q.size();
        q.add(x);
        for(int i=0;i<s;i++) {
            q.add(q.poll());
        }
    }
    public int pop() {
        int n = q.peek();
        q.poll();
        return n;
    }
    public int top(){
        return q.peek();
    }
    public int size(){
        return q.size();
    }
 }
public class sWithQue {
    public static void main(String[] args) {
        Qstack st = new Qstack();
        st.push(3);
        System.out.println(st.top());
        st.push(99);
        System.out.println(st.pop());
        System.out.println(st.size());

    }
}
