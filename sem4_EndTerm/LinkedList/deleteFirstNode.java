// Delete the head node and return the new head
    static Node deleteHead(Node head) {

        if (head == null)
            return null;

        Node temp = head;

        head = head.next;

        temp = null;

        return head;
    }
