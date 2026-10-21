import java.util.*;


public class inputArray{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        // O[n]
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        sc.close();

        // O[n]
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

// Complexity

// Time : O(n)

// Space : O(1)