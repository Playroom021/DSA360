import java.util.HashMap;

// Input:
// nums = [2, 7, 11, 15]
// target = 9

public class TwoSum{

  public static int [] Solution(int[] nums, int target ){

    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
        int required = target - nums[i];

          if (map.containsKey(required)) {
              return new int[]{map.get(required), i};
          }

          map.put(nums[i], i);
      }

      return new int[]{-1,-1};
    }

  public static void main (String [] args ){
    int [] nums= {2, 7, 11, 5};
    int target = 18;
    int [] result=Solution(nums,target);
    System.out.println(result[0]);
    System.out.println(result[1]);
  }
}