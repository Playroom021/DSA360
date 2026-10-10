package day006;

    // 1. Understand Variable-Size Sliding Window
    // In a fixed-size window, the window length stays constant, such as \(k=3\).
    // In a variable-size window, the window grows or shrinks depending on a condition.
    // The general pattern is:


        // int left = 0;

        // for (int right = 0; right < nums.length; right++) {

        //     // Add nums[right] to the window

        //     while (/* window is invalid */) {
        //         // Remove nums[left]
        //         left++;
        //     }

        //     // Update the answer
        // }


    // - right expands the window.
    // - left shrinks the window.
    // - The while loop restores the required condition.
    // - Update the answer when the window satisfies the problem's requirements.

public class LongestSubarraywithSumK {

    // Given an array nums of positive integers and an integer k,
    //  find the length of the longest contiguous subarray whose sum equals k.

    public static int longestSubarray(int [] nums, int k){
        int left =0;
        int sum=0;
        int maxLength=0;

        for (int right = 0; right < nums.length; right++) {
            
            sum =sum +nums[right];

            while (sum > k && left <= right) {
                sum -= nums[left];
                left++;
            }

            if (sum == k) {
                maxLength = Math.max(
                    maxLength, right - left + 1
                );
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 1, 1, 3};
        int k = 3;

        System.out.println(longestSubarray(nums, k));
    }

}
