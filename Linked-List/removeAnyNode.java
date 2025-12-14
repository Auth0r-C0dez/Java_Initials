package linkedList;

class Node{
    int data;
    Node next;

    Node(int data1, Node next1){
        this.data= data1;
        this.next = next1;
    }
    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class removeAnyNode {
    public static void main(String[] args) {
        int arr[] = {3,4,6,2,5,7,3};
        Node head = arr2ll(arr);
        print (head);
        int k = 1;
        System.out.println("LL after removing the kth node is ");
        head = removeKNode(head, k);
        print(head);

    }
    private static Node removeKNode(Node head,int k) {
        if(head == null) return head;
        if(k ==1 ) {
            
            return head.next;
        }
        int cnt = 0;
        Node prev = null;
        Node temp = head;
        while(temp!= null) {
            cnt++;
            if(cnt == k) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    private static Node arr2ll(int arr[]) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover= temp;
        } return head;
    }
    private static void print(Node head) {
        while(head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }System.out.println();
    }
}
