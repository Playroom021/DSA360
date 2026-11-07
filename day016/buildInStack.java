import java.util.Stack;

public class buildInStack{
    public static void main(String [] args){

        Stack<Integer> stack =new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack);
        
        System.out.println(stack.peek());    // 30
        System.out.println(stack.pop());     // 30
        System.out.println(stack.size());    // 2
        System.out.println(stack.isEmpty()); // false
        System.out.println(stack.search(10));// 2
    }
}