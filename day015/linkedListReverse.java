class Node {
    int data;
    Node next;
    Node (int data){
        this.data=data;
        this.next=null;
    }
}

public class linkedListReverse{
    public static Node Reverse (Node head){
        Node prev=null;
        Node current=head;
        // Node next = head.next;

        while(current!=null){
            Node next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }

        return prev;
    }

    public static void main (String [] args){
        Node first =new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node forth = new Node(40);
        
        first.next=second;
        second.next=third;
        third.next = forth;
        
        Node head =first;
        head = Reverse(head);

        Node temp =head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        // System.out.println (Search(head,80));
    }
}