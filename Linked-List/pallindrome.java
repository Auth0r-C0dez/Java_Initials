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

public class pallindrome {
    public static void main(String args[]) {
        int arr[] = {1,2,3,4,3,2,1};
        Node head = arr2LL(arr);
        print(head);
        System.out.println();
        // head = reverseRecur(head);
        // print(head);
        Boolean ck = palin(head);
        if(ck) {
            System.out.println("its palindrome");
        }else{
            System.out.println("laura hai palindrome");
        }
    }
    private static boolean palin(Node head) {
        if(head==null||head.next==null) {
            return true;
        }
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!=null) {
            slow = slow.next;
            fast= fast.next.next;
        }
        Node newNode = reverseRecur(slow.next);
        Node samne = head;
        Node peche = newNode;
        while(peche!=null) {
            if(samne.data != peche.data) {
                reverseRecur(newNode);
                return false;
            }
            samne = samne.next;
            peche = peche.next;

        }reverseRecur(newNode);
        return true;
    }
    private static Node reverseRecur(Node head) {
        if(head==null || head.next == null) {
            return head;
        }
        Node newHead = reverseRecur(head.next);
        Node ewHead = head.next;
        ewHead.next = head;
        head.next= null;
        return newHead;
    }

    private static void print(Node head) {
        while(head!=null) {
            System.out.print(head.data+"->");
            head = head.next;
        }
    }
    private static Node arr2LL(int[] arr) {
        Node head = new Node(arr[0]);
        Node check = head;
        for(int i=1;i<arr.length;i++) {
            Node temp = new Node(arr[i]);
            check.next = temp;
            check = temp;

        } return head;
    }
    
}
