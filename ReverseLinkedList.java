 public void reverse () {
        Node previous = null;
        Node current = tail = head;
        Node next;

        while(current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }
