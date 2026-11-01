class Node {
    int data ;
    Node next ;
    Node (int data){
        this.data=data;
        this.next= null;
    }
}

public class linkedListInsertion{
    public static Node insertAtBegeinning(Node head,int value){
        Node newNode = new Node(value) ;

        newNode.next=head;
        head=newNode;

        return head;
    }
    public static Node insertAtEnd(Node head,int value){
        Node newNode= new Node(value);
        
        if(head ==null){
            return newNode;
        }
            
        Node current =head;
        
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;

        return head;
    }

    public static void main(String[] args){
        Node first =new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        
        first.next=second;
        second.next=third;
        
        Node head =first;
        
        // System.out.println (head.data);
        // System.out.println (head.next.data);
        // System.out.println (head.next.next.data);

        head=insertAtBegeinning(head,40);
        head=insertAtEnd(head,50);
        
        Node temp =head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }

        
    }
    
}