package day005;

//useing two pointers insted of nested loop ( time Comlexity: O(n^2) -> O(n) ) 

public class TwoSum_II {
    public static int [] TwoSum(int [] nums , int target ){
        int left=0;
        int right= nums.length-1;

        while(left<right){

            int sum=nums[left]+nums[right];

            if(sum==target){
                return new int[] {left,right};
            }
            else if(target<sum){
                right--;
            }
            else {
                left++;
            }

        }
        return new int[]{-1,-1};
    }

    // only for shorted array
    // O(n)

    public static void main(String [] args){
        int [] nums = {0, 2, 3, 4, 6};
        int target = 5;
        
        int [] result =TwoSum(nums,target);

        System.out.println (result[0]+" "+ result[1]);
    }

}
