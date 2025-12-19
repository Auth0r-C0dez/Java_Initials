class Node {
    int data;
    Node next;

    Node(int data1,Node next1) {
        this.data = data1;
        this.next = next1;
    }
    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}
public class reverseLl {
    public static void main(String[] args) {
        int arr[] = {2,3,5,7,8};
        Node head = arr2ll(arr);
        print(head);
        head=reverseLL(head);
        print(head);
    }
    private static Node reverseLL(Node head) {
        Node temp = head;
        Node then = null;
        while(temp!=null) {
            Node now = temp.next;
            temp.next = then;
            then = temp;
            temp = now;     

        }return then;
    }
    private static void print(Node head) {
        while(head!=null) {
            System.out.print(head.data+"-> ");
            head = head.next;
        }System.out.println();
    }
    private static Node arr2ll(int[]arr){
        Node n1 = new Node(arr[0]);
        Node head = n1;
        for(int i=1;i<arr.length;i++) {
            Node temp = new Node(arr[i]);
            head.next = temp;
            head = temp;
        }return n1;
    }
}
