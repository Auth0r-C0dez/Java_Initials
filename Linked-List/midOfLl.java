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

public class midOfLl {
    public static void main(String[] args) {
        System.out.println("whatever happens in vegas stays in vegas");
        int[] arr = {3,5,6,2,56,88,8,9,89,78};
        Node head = arr2Ll(arr);
        print(head);
        head = middle(head);
        System.out.println(head.data);

    }
    private static Node middle(Node head) {
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next!=null && slow!=null) {
            fast= fast.next.next;
            slow= slow.next;
        }return slow;
    }
    private static void print(Node head) {
        while(head!=null) {
            System.out.print(head.data+"-> ");
            head = head.next;
        }System.out.println();
    }
    private static Node arr2Ll(int[] arr) {
        Node n1 = new Node(arr[0]);
        Node head = n1;
        for(int i = 1;i<arr.length;i++) {
            Node temp = new Node(arr[i]);
            head.next = temp;
            head = temp;
        }return n1;
    }
}
