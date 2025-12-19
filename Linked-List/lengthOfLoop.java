//Given the head of a linked list, determine the length of a loop present in the linked list. If there's no loop present, return 0.
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
class Captain{

    public int lengthLoop(Node head) {
        Node fast = head;
        Node slow = head; 
        while(fast!= null && fast.next!= null) {
            fast = fast.next.next;
            slow= slow.next;
            if(slow == fast){
                return kotoBoro(slow);
            }
        } return 0;
    }
    public int kotoBoro(Node slow) {
        int length = 1;
        Node temp = slow;
        while(temp.next!=slow) {
            
            temp= temp.next;
            length++;
        } return length;
    }
}
public class lengthOfLoop {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        // Linking the nodes
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        // Creating a loop from fifth to second
        fifth.next = second;
        Captain done = new Captain();
        int lamba = done.lengthLoop(head);
        if (lamba > 0) {
            System.out.println("Length of the loop: " + lamba);
        } else {
            System.out.println("No loop found in the linked list.");
        }

    }
    
}
