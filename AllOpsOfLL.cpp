#include <iostream>
using namespace std;

class Node {
    public:
    int data;
    Node* next;

    Node(int data) {
        this -> data = data;
        //data = 5; if this is used then dont use the parametarised constructor
        this -> next = NULL;
    }
    //creating a destructor
    ~Node() {
        int value = this ->data;
        //freeing the memory
        if(this ->next !=NULL) {
            delete next;
            this ->next = NULL;

        }
        cout<< " memory is free for node with data " << value <<endl;
    }
};
void InsertAtHead(Node* &head,int d)//here we create a funxtion to create a node that tkes the reference of 
//the original node and a part for data and for pointing to the LL but it is inserted in front 
 {
    //creating a new node
    Node* temp = new Node(d);
    temp -> next = head; //here the new node points to the existing node (known as head for existing node)
    head = temp; //the new node gets the head 

}
void InsertAtTail(Node* &tail,int d) {
    Node* temp = new Node(d);
    tail -> next = temp; //here the temp gets connectd to nxt of previous node
    tail = tail ->next; // here the tail gets assigned to the last node
}

void print(Node* &head)//here we take the reference in order to avoid making a copy of the existing LL 
 { 
    Node* temp = head;

    while(temp != NULL) {
        cout<< temp -> data <<" ";
        temp  = temp -> next;
    }
    cout<<endl;

}
void InsertAtPos(Node* &tail,Node* &head,int pos,int d ) {

    // in order to insert at the head 
     if(pos ==1 ) {
         InsertAtHead(head,d);
         return;
     }
    Node* temp = head;
    int cnt =1;
    //traversing the node
    while(cnt < pos-1) {
        temp = temp -> next;
        cnt++;
    }
    //inserting at the last node
    if(temp ->next == NULL) {
        InsertAtTail(tail,d);
        return;
    }
    //creating a new node for d value
    Node* nodetoinsert = new Node(d);//after finding the position to insert a node we create a new node
    nodetoinsert ->next = temp ->next; //the pointer of pre is emptied and the same job is given to the new node
    temp->next = nodetoinsert; // the pointer of the prev node is connecting the newly created node
}

void deletenode(int pos,Node* &head) {
    //deleting the first or start node
    if(pos == 1) {
        Node* temp = head;
        head = head ->next;
        //memory free start node
        temp -> next = NULL;
        delete temp;
    }
    else {
        //deleting any middle or last node
        Node* curr  = head;
        Node* prev  = NULL;

        int cnt =1 ;
        while(cnt < pos) {
            prev = curr;
            curr = curr->next;
            cnt++;
        }
        prev -> next = curr ->next;
        curr -> next = NULL;
        delete curr;
    }
}

int main () {

    //here we are creating a node
    Node* node1 = new Node(69);
    cout<< node1 -> data<<endl;
   // cout<< node1 -> next<<endl;

    //head of the node is pointed
    Node* head = node1; //here a head named node is created which is used in the other functio to insert nd print
    Node* tail = node1;
   // print(head);
    //InsertAtHead(head, 55);
    InsertAtTail(tail, 55);
   // print(head);
    //InsertAtHead(head, 15); // likewise we can add as many elements as we want in front of the LL
    InsertAtTail(tail, 15);
    InsertAtPos(tail,head,1,40);
    print(head);
    cout<<"head" <<head->data<<endl;
    cout<<"tail" <<tail->data<<endl;  
    deletenode(3,head);
    print(head); 
    return 0 ;
}
