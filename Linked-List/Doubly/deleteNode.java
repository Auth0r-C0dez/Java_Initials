class Node {
    int data;
    Node next;
    Node prev;

    Node(int data1, Node next1, Node prev1) {
        this.data = data1;
        this.next = next1;
        this.prev = prev1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
        this.prev = null;
    }
}


public class daleteNode {
    public static void main(String[] args) {
        int arr[] = {23,45,25,2,6,2};
        System.out.println("DLL before deleting the head");
        Node dll = arr2Dll(arr);
        print(dll);
        //dll = delHead(dll);
        dll  = delNo(dll,45);
        print(dll);

    }
    private static Node delNo(Node head, int key) {
        if(head == null){
            return null;
        }
        if(head.data == key ) {
            return head= head.next;
        }
        
        Node check = head;
        Node out = null;
        while(check!=null) {
                     
            if(check.data == key) {
                out.next = out.next.next;
                out.next.prev = out;;          
            }out = check;
            check = check.next;          
        }return head;
    }

    private static Node delHead(Node head) {
        if(head == null || head.next == null) {
            return null;
        }
        Node sac = head;
         head = head.next;
         sac.next = null;
         head.prev = null;
         return head;

    }

    private static void print(Node head) {
        while(head != null){
            System.out.print(head.data +" -> ");
            head= head.next;         
        }System.out.println();
    }

    private static Node arr2Dll(int[] arr) {
        Node head = new Node(arr[0]);
        Node n1 = head;
        for(int i=1;i<arr.length;i++) {
            Node temp = new Node(arr[i],null,n1);
            n1.next = temp;
            n1 = temp;
        }
        return head;
    }
}
