class Node{
    int data;
    Node next;
    Node prev;

    Node(int data1,Node next1,Node prev1) {
        this.data= data1;
        this.next = next1;
        this.prev = prev1;
    }
    Node(int data1){
        this.data= data1;
        this.next = null;
        this.prev= null;
    }
}

public class reverseDll {
    public static void main(String[]args) {
        int[] arr= {2,34,4,2,4};
        Node head = arr2Dll(arr);
        print(head);
        System.out.println("reversed Dll is ");
        head=reversingDll(head);
        print(head);

    }
    private static Node reversingDll(Node head) {
        Node now = head;
        Node then = null;
        while(now!=null) {
            Node temp = now.next;
            now.next = now.prev;
            now.prev= temp;
            then = now;
            now = temp;
        }return then;
    }
    private static void print(Node head) {
        while(head!=null){
            System.out.print(head.data+"->");
            head = head.next;
        }System.out.println();
    }
    private static Node arr2Dll(int arr[]) {
        Node n1 =  new Node(arr[0]);
        Node head = n1;
        for(int i=1;i<arr.length;i++) {
            Node temp = new Node(arr[i],null,head);
            head.next= temp;
            head = temp;
        }return n1;
    }
    
}
