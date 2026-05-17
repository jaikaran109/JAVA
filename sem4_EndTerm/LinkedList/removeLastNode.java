static Node removeLastNode(Node head) {
        // If the list is empty, return null
        if (head == null || head.next == null) {
            return null;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;

        return head;
    }
