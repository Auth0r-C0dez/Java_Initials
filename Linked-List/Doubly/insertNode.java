class Node{
    int data;
    Node next;
    Node prev;

    Node(int data1,Node next1,Node prev1) {
        this.data = data1;
        this.next = next1;
        this.prev= prev1;
    }
    Node(int data1) {
        this.data = data1;
        this.next= null;
        this.prev= null;
    }
}

public class insertNode {
    public static void main(String args[]) {
        int arr[] = {3,2,45,2,5};
        System.out.println("the doubly linked list is ");
        Node show = arr2Dll(arr);
        print(show);
        System.out.println("DLL after inserting at head");
        show = InsertHead(show,222);
        print(show);
        System.out.println("Dll after inserting at tail");
        show = InsertTail(show, 108);
        print(show);

    }
    private static Node InsertTail(Node head,int val){
        Node infant = new Node(val);
        if(head== null){
            return infant;
        }
        Node t = head;
        while(t.next !=null) {
            t = t.next;

        } 
        t.next= infant;
        infant.prev = t;
        return head;
    }

    private static Node InsertHead(Node head,int val) {
        Node now = new Node(val,head,null);
        head.prev = now;
        return now;
    }

    public static void print(Node head) {
        while(head!=null){
            System.out.print(head.data+"->");
            head = head.next;
        }System.out.println();
    }

    private static Node arr2Dll(int arr[]) {
        Node n1 = new Node(arr[0]);
        Node head = n1;
        for(int i=1;i<arr.length;i++) {
            Node temp = new Node(arr[i],null,head);
            head.next = temp;
            head = temp;        
        }return n1;
    }
}
