public class LinkedList {
    //time complexity of this data structure is linear
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

    public void addlast(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    //for adding in the middle.
    public void add(int index,int data) {
        Node newNode = new Node(data);
        Node temp = head;
        int i= 0;
        while(i <index-1) {
            temp = temp.next;
            i++;
        }

        //if we get the desaired index then
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static void main(String args[]) {
        LinkedList li = new LinkedList();
        li.print();
        li.addfirst(1);
        li.print();
        li.addfirst(2);
        li.print();
        li.addlast(8);
        li.print();
        li.addlast(4);
        li.print();
        li.add(2,5);//first we are to give the index then the value at the index
        li.print();
    }
}
