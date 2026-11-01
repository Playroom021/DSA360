
class Node {
    int data;
    Node next;

    Node (int data){
        this.data=data;
        this.next=null;
    }
}


public class linkedListExe{
    public static void main(String[] args){
        Node first =new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        
        first.next=second;
        second.next=third;
        
        Node head =first;
        
        System.out.println (head.data);
        System.out.println (head.next.data);
        System.out.println (head.next.next.data);

        Node temp =head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        
    }
}