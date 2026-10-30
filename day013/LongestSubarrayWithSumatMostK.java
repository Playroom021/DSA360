//  Longest Subarray With Sum at Most K

// Given a non-negative array, 
// find the length of the longest contiguous subarray whose sum is at most k.

// Example: nums = [1, 2, 1, 0, 1, 1, 0], k = 4

// Expected output: 5


public class LongestSubarrayWithSumatMostK{
    public static int maxArraySize(int[] nums ,int k){
        int left =0;
        int maxOutput =0;
        int sum=0;
        for(int right =0;right<nums.length;right++){
            sum += nums[right];
            while(k<sum){
                sum -= nums[left];
                left ++;
            }
            maxOutput = Math.max(
                maxOutput, right - left + 1
            );
        }
        return maxOutput;
        
    }
    public static void main(String [] args ){
        int [] nums = {1, 2, 1, 0, 1, 1, 0};
        int k = 4;
        System.out.println (maxArraySize(nums,k));
    }
}