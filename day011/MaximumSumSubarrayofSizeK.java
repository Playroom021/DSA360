import java.util.*;

public class MaximumSumSubarrayofSizeK(
   public static int maxSum(int []nums,int k){

        if (k <= 0 || k > nums.length) {
            throw new IllegalArgumentException("Invalid k");
        }

        int windowSum=0
        // HashMap<Integer,Integer> map =new HashMap<>();
        for(int i=0;i<k;i++){
            windowSum+= nums[i];
        }
        int maxSum= windowSum;
        for(int i=k;i<nums.length;i++){
            windowSum+= nums[i] -nums[i-k];

            maxSum= Math.max(maxSum,windowSum);
        }
    return maxSum;
   }

    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 1, 3, 2};
        System.out.println(maxSumSubarray(nums, 3));
    }
)