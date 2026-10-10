package day005;

public class MaxSum {


    public static int maxSum(int[] nums, int k) {

        int windowSum = 0;

        // First window
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        int maxSum = windowSum;

        // Slide the window
        for (int i = k; i < nums.length; i++) {

            windowSum += nums[i];

            windowSum -= nums[i - k];

            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main (String [] args){
    
        int [] nums ={2, 1, 5, 1 , 3,  2};
        int result = maxSum(nums,3);
        System.out.println (result);

    }

}
