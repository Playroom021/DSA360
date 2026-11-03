class Node{
    int data;
    Node next;
    Node (int data){
        this.data =data;
        this.next=null;
    }
}

public class LinkedListLooping{
    public static boolean isLoop(Node head){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static Node loopStartingNode(Node head){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                fast=head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
        return null;
    }

    public static void main (String [] args){
        Node first =new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node forth = new Node(40);
        Node fifth =new Node(50);
        
        first.next=second;
        second.next=third;
        third.next = forth;
        forth.next=fifth;
        
        fifth.next=second;
        
        Node head =first;

        // Node temp =head;
        // while(temp!=null){
        //     System.out.println(temp.data);
        //     temp=temp.next;
        // }

        Node staringNode = loopStartingNode(head);
        System.out.println (staringNode.data);

        System.out.println(isLoop(head));
    }
}

