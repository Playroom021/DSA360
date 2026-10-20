package day005;

public class ContainerWithMostWater {

    public static int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;

        int maxArea = 0;

        while (left < right) {

            int width = right - left;

            int currentHeight =
                    Math.min(height[left], height[right]);

            int currentArea = width * currentHeight;

            maxArea = Math.max(maxArea, currentArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }


    public static void main(String []args){

        int [] nums={1,8,6,2,5,4,8,3,7};

        int result = maxArea(nums);

        System.out.println (result);

        // for(int x:nums){
        //     System.out.println(x);
        // }

    }
}
