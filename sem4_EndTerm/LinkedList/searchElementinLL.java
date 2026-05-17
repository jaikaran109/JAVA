public class GFG {
    static boolean searchKey(Node head, int key) {

        Node curr = head;

        while (curr != null) {

            if (curr.data == key)
                return true;

            curr = curr.next;
        }

        return false;
    }
}
