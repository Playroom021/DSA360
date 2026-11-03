class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class FastSlowPointer{
    public static Node findMiddle(Node head){
        Node slow =head;
        Node fast =head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast =fast.next.next;
        }
        return slow;
    }

    public static void main(String [] args){
        Node first =new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node forth = new Node(40);
        
        first.next=second;
        second.next=third;
        third.next = forth;
        
        Node head =first;

        Node temp =head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }

        Node mid=findMiddle(head);
        System.out.println(mid.data);
    }
}