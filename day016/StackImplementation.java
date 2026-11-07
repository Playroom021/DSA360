// Stack Implementation using array 
class MyStack{
    int [] arr;
    int top;
    int capacity;

    MyStack(int size){
        arr = new int [size];
        capacity=size;
        top =-1;
    }
    // Insert element 
    public void push (int x){
        if (top == capacity -1){
            System.out.println("Stack Overflow");
            return ;
        }

        top ++;
        arr[top]=x;
        return ;
    }
    // remove element
    public int pop(){
        if(top==-1){
            System.out.println ("stack underflow ");
            return -1;
        }
        int remove = arr[top];
        top--;
        return remove;
    }
    // get top element 
    int peek(){
        if (top ==-1){
            return -1;
        }
        return arr[top];
    }
    // Check empty
    boolean isEmpty() {
        return top == -1;
    }
}
public class StackImplementation{
    
    public static void main(String[] args) {

        // MyStack s = new MyStack(5);

        // s.push(10);
        // s.push(20);
        // s.push(30);

        // System.out.println(s.peek()); // 30

        // System.out.println(s.pop());  // 30

        // System.out.println(s.peek()); // 20

        // System.out.println(s.isEmpty()); // false

        MyStack s = new MyStack(3);

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        
        System.out.println(s.pop());
        System.out.println(s.peek());
    }
}