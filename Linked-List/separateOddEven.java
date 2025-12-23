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

public class separateOddEven {
    public static void main(String[] args) {
        int arr[] = {3,5,33,56,7,2,6,4,1};
        Node na = arr2ll(arr);
        print(na);
        System.out.println();
        Node na1 = separation(na);
        print(na1);
    }
    private static Node separation(Node head){
        if(head==null||head.next ==null) {
            return head;
        }
        Node evenh=null,event=null,oddh=null,oddt=null;
        Node current = head;
        while(current!=null) {
            if(current.data%2==0) {
                if(evenh==null) {
                    evenh=current;
                    event= current;
                } else {
                    event.next = current;
                    event = current;
                }
            }else {
                if(oddh==null) {
                    oddh=current;
                    oddt = current;
                }else {
                    oddt.next=current;
                    oddt=current;
                }
            }current = current.next;
        }
        if(evenh==null) return oddh;
        if(oddh==null) return evenh;
        event.next=oddh;
        oddt.next=null;
        return evenh;
    }
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
}
