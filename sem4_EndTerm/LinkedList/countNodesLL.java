/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int a){
        data = a;
        next = null;
    }
}
*/
class Solution {
    public int getCount(Node head) {
        Node temp = head;
        int count = 0;
        if(head == null) return count;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}
