public class MinimumSizeSubarraySum{
    public static int minSubArrayLen(int []nums,int target){
        int left =0;
        int sum =0;
        int minLength=0;

        for(int right=0;right<nums.length;right++){
            sum +=nums[right];

            while(sum>=target){
                minLength =Math.min(minLength,right-left +1);
                sum-=nums[left];
                left++;
            }
        }
        return minLength==Integer.MAX_VALUE ? 0 :minLength;
    }
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        System.out.println(minSubArrayLen(7, nums));
    }
}