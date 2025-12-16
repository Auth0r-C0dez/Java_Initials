

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data1, Node next1, Node prev1) {
        this.data  =  data1;
        this.next = next1;
        this.prev = prev1;
    }

    Node (int data1 ) {
        this.data = data1;
        this.next = null;
        this.prev = null;
    }
}


public class pilot {
    public static void main(String[] args) {
        int arr[] = { 46,23 ,35,2,6,8,23};
        Node head = arr2Dll(arr);
        System.out.println(head);
        System.out.println(head.data);

    }

    private static Node arr2Dll(int arr[]) {
        Node head = new Node(arr[0]);
        return head;
    }


}
