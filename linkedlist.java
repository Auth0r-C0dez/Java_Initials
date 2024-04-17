public class LinkedList {
    //creating a function for creation of node
     public static class Node {
        int data;
        Node next;
        
        //setting the type of linked list
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
     }
      //setting the beginning and end of LL
     public static Node head;
     public static Node tail;
    //creating method to add values to nodes
    public void addfirst(int data) {

         //creating new node
        Node newNode = new Node(data);//creating an object of class node

        if(head == null) {
            head = tail = newNode;
            return;
        }

       

        //assigning the value to the nxt node
        newNode.next = head;//here one node is linked to another node

        //assigning the value of head to new nodw
        head = newNode;
    }


    public static void main(String args[]) {
        LinkedList li = new LinkedList();
        li.addfirst(1);
        li.addfirst(2);
    }
}
