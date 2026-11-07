class Node{
    int data;
    Node next;
    Node (int data){
        this.data =data;
        this.next=null;
    }
}

public class LinkedListDeletion {
    public static Node RemoveNthLastNode(Node head,int n){
        Node dummy = new Node(0);
        dummy.next = head;
        
        Node fast =dummy;
        Node slow =dummy;
        while (n!=0){
            fast=fast.next;
            n--;
        }
        while (fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next = slow.next.next;

        return head;
    }
}