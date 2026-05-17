/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertPos(Node head, int pos, int val) {
        // code here
        Node newNode = new Node(val);
        
        if(pos <= 1) {
            newNode.next = head;
            return newNode;
        }        
        
        int count = 1;
        
        Node temp = head;
        
         while ( temp.next != null && count < pos - 1) {
            count++;
            temp = temp.next;
        }


        newNode.next = temp.next;
        temp.next = newNode;
        
        return head;
        
    }
}
