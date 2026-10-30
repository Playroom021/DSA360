// Maximum Consecutive Ones III

// Given a binary array and an integer k,
// find the longest sequence of ones you can obtain by flipping at most k zeros.

// Example: nums = [1,1,0,0,1,1,1,0], k = 2

// Expected output: 6

public class MaximumConsecutiveOnes{
    public static int maxConsicutiveOne(int[]nums,int k){
        int left=0;
        int zeroCount=0;
        int maxLength=0 ;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==0){
                zeroCount++;
            }
            while (zeroCount>k){
                if(nums[left]==0){
                    zeroCount--;
                }
                left ++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
    public static void main(String [] args ){
        int [] nums = {1,1,0,0,1,1,1,0};
        int k = 2;
        System.out.println (maxConsicutiveOne(nums,k));
        
    }
}