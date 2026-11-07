class Node {
    int data;
    Node next;
    Node (int data){
        this.data=data;
        this.next=null;
    }
}

public class linkedListSearch{

    public static boolean Search(Node head,int value){
        Node current = head;
        while(current.next!=null){
            if(current.data==value){
                return true;
            }
            current=current.next;
        }
        return false;
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
        System.out.println (Search(head,30));
        System.out.println (Search(head,80));
    }
}