import java.util.HashMap;

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
public class detectLoop {
    public static void main(String args[]) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        // Create a loop
        fifth.next = third;
        Boolean n1 = check(head);
        System.out.println(n1);
    }  
    private static boolean check(Node head){
        Node temp = head;
        HashMap<Node,Integer> nodeMap = new HashMap<>();
        while(temp!=null) {
            if(nodeMap.containsKey(temp)) {
                return true;
            }
            nodeMap.put(temp, 1);
            temp = temp.next;
        }return false;
    }
    
}
