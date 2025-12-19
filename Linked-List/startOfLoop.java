//Given the head of a linked list that may contain a cycle, return the starting point of that cycle. If there is no cycle in the linked list return null.
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
    
    
}
public class startOfLoop {
    public static void main(String[] args) {
        // Create nodes
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);

        // Create cycle: last node connects to node with value 2
        head.next.next.next.next = head.next;

        
        ListNode result = detectCycle(head);

        if (result != null)
            System.out.println("Cycle starts at node with value: " + result.val);
        else
            System.out.println("No cycle found.");
    }
    private static ListNode detectCycle(ListNode head){
        ListNode fast= head; 
        ListNode slow = head;
        
        while(fast!=null && fast.next !=null) {
            fast= fast.next.next;
            slow = slow.next;
            if(slow== fast) {
                slow = head;
                while(slow!=fast) {
                    slow= slow.next;
                    fast = fast.next;
                }return slow;
            }
        }return null;

    }
    
}



