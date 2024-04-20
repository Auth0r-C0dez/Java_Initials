 //code for removing a element from nth position from end
    public void delete(int n) {

        //for calculating size
        int si = 0;
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
            si  ++;
        }
        //if head is to be removed
        if(n == si) {
            head = head.next;//for removing the first element
            return;
        }

        //for removing from back
        int i = 1;
        int itofind = si -n;
        Node prev = head;
        while(i < itofind) {
            prev = prev.next;
            i++;
        }
        //by this line the pointer node will skip one list and point to the next and hence the middle node will be deleted
        prev.next = prev.next.next;
        return;
    }
