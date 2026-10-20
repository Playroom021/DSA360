import java.util.HashMap;

public class LongestSubarraywithSumK{
    public static int longestSubarray(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int prefixSum = 0;
        int maxLength = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];

            if (prefixSum == k) {
                maxLength = i + 1;
            }

            int required = prefixSum - k;

            if (map.containsKey(required)) {
                int length = i - map.get(required);
                maxLength = Math.max(maxLength, length);
            }

            // Preserve the earliest occurrence.
            map.putIfAbsent(prefixSum, i);
        }

        return maxLength;
    }
  
  public static void main (String[] args){
    int [] nums = { 8,9,2,1,1,2,3,5,6,2};
    int target= 4;

    int result=longestSubarray(nums,target);

    System.out.println(result);
  }
  
}