class Node{
    int data;
    Node next;
    Node (int data){
        this.data=data;
        this.next=null;
    }
}

public class linkedListDeletion{

    public static Node deleteFirst(Node head){
        if(head==null){
             System.out.println ("nothing to delete");
            return head;
        }
        head=head.next;
        return head;
    }
    
    public static Node deleteLast(Node head){
        if(head==null || head.next ==null){
             System.out.println ("nothing to delete");
            return head;
        }
        
        Node current = head;
        while(current.next.next!=null){
            current=current.next;
        }
        current.next=null;
        return head;
    }
    
    public static Node deleteByValue(Node head,int value){
        if(head==null ){
             System.out.println ("nothing to delete");
            return null;
        }

        if(head.data==value){
            head=head.next;
            return head;
        }

        Node current = head;
        while(current.next!=null && current.next.data!=value){
            current=current.next;
        }
        if(current.next != null){
            current.next=current.next.next;
            // return head;
        }
        // current.next=current.next.next;
        return head;
    }
    
    
    public static void main(String[] args){
        Node first =new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node forth = new Node(40);
        
        first.next=second;
        second.next=third;
        third.next = forth;
        
        Node head =first;

        head =deleteFirst(head);
        // head =deleteLast(head);
        head =deleteLast(head);
        // head =deleteByValue(head,30);
        head =deleteByValue(head,20);

        
        Node temp =head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}