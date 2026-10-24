public class LongestSubarrayWithSumatMostK{

// 2. Problem 1 — Longest Subarray With Sum at Most K
 
// Given:
// int[] arr = {2, 1, 3, 2, 1};
// int k = 7;

// Expected output:
// 4

//     Approach:
// 1. Add arr[right] to the running sum.
// 2. While sum > k, subtract arr[left] and increment left.
// 3. Update the maximum window length.
    
    public static int LongestSubarray(int [] nums, int k ){
        int left =0;
        int sum =0;
        int maxLength=0;

        for(int right=0;right<nums.length;right++){
            sum+=nums[right];

            while(sum > k){
                sum-= nums[left];
                left++;
            }

            maxLength = Math.max(maxLength,right - left +1);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 2, 1};
        System.out.println(longestSubarray(arr, 7));
    }
}