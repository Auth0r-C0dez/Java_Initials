package linkedList;

class Node {
    int data;
    Node next;

    Node(int data1,Node next1) {
        this.data = data1;
        this.next = next1;
    }
    Node (int data1) {
        this.data = data1;
        this.next= null;
    }
}

public class traverse {

    public static void main(String[] args) {
        int arr[] ={3,5,23,5,67};
        Node head = convertArr2LL(arr);
        Node temp = head;
        int cnt =0;
        while(temp!= null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
            cnt++;
        }
        System.out.println("total nodes "+cnt);
    }
    

    private static Node convertArr2LL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
}

//TODO check for an element present or not
