import java.util.*;

class NextGreaterElement{
    //1. Problem: Next Greater Element
        // Given an array of integers, find the first element greater than the current element on its right.
        
        // If no greater element exists, return -1.
        // Example 1
        // Input:
        // arr = [4, 5, 2, 10, 8]
        
        // Output:
        // [5, 10, 10, -1, -1]

    public static int [] GreaterElement(int []arr){
        int [] ans =new int [arr.length];
        int max=arr.length -1;
        Stack <Integer> stack= new Stack<>();
    
        for(int i=arr.length-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<=arr[i]){
                stack.pop();
            }
            if (stack.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = stack.peek();
            }

            stack.push(arr[i]);
        }
        return ans;
    }
    public static void main(String[] args) {

        int[] arr = {6, 8, 0, 1, 3};

        System.out.println(
            Arrays.toString(GreaterElement(arr))
        );
    }
}