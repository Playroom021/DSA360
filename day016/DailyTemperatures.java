import java.util.*;

class DailyTemperatures{
    // Problem Statement
    //     You are given an array temperatures, where:
        
    //     temperatures[i] represents the temperature on the i-th day.
        
    //     For each day, find how many days you mustdailyTemperatureswait until a warmer temperature.
        
    //     If there is no future day with a warmer temperature, store 0.
        
    //     Example:
    //     temperatures = [73, 74, 75, 71, 69, 72, 76, 73]
        
    //     Expected output:
    //     [1, 1, 4, 2, 1, 1, 0, 0]
    public static int[] dailyTemperatures(int[] temperature){
        int n= temperature.length;

        int [] ans=new int[n];

        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n ;i++){
            while (!stack.isEmpty() &&
                   temperature[i] > temperature[stack.peek()]) {

                int previousIndex = stack.pop();

                ans[previousIndex] = i - previousIndex;
            }
            stack.push(i);
        }
        return ans;
    }
    
    public static void main (String [] args){
        int [] temperature={73, 74, 75, 71, 69, 72, 76, 73};
        int[] answer = dailyTemperatures(temperature);
        System.out.println(Arrays.toString(answer));
    }
}