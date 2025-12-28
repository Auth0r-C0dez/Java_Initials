class Node{
    int data;
    Node next;
    Node(int data1) {
        this.data = data1;
        this.next=null;
    }
}

class LlStack{
    private Node head;
    private int size;
    LlStack() {
        head = null;
        size=0;
    }
    public int top() {
        if(head==null) return -1;
        return head.data;
    }
    public int pop(){
        if(head==null) return -1;
        int v = head.data;
        Node temp = head;
        head=head.next;
        temp=null;
        size--;
        return v;
    }
    public void push(int x) {
        Node element = new Node(x);
        element.next = head;
        head=element;
        size++;
    }
    public int size() {
        return size;
    }
}

public class stWithLl {
    public static void main(String[] args) {
        LlStack st = new LlStack();
        st.push(44);
        st.push(3);
        System.out.println(st.top());
        st.push(99);
        System.out.println(st.pop());
        System.out.println(st.size());
    }
}
