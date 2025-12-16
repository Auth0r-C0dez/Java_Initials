package linkedList;

class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }
    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class insertion {
    public static void main(String[] args) 
    {
        int arr[] = {3,4,65,2,4,2};
        Node head = arr2ll(arr);
        print(head);
        System.out.println("LL after inserting at the head");
        head = insert(23,head);
        print(head);
        System.out.println("LL after inserting at the tail");
        head = tail(100,head);
        print(head);

    }
    private static Node tail(int val,Node head) {
        if(head == null) return new Node(val);
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;

        }
        Node newNode = new Node(val);
        temp.next = newNode;
        return head;
    }
//TODO insertion at spwcific places and at specific values


    private static void print(Node head) {
        while(head!= null) {
            System.out.print(head.data +" ");
            head = head.next;
        }
        System.out.println();
    }
    private static Node arr2ll(int arr[]) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover= temp;
        }
        return head;
    }
    
    private static Node insert(int val,Node head) {
        Node n1 = new Node(val,head);
        return n1;


    }
    
}
