import java.util.HashMap;

public class CountSubarrayswithSumK{
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {
            prefixSum += num;
            System.out.println("prefixSum  "+prefixSum);
            

            int required = prefixSum - k;

          System.out.println("required  "+ required);

            if (map.containsKey(required)) {
                count += map.get(required);
            }

          System.out.println("count  "+count);

            map.put(
                prefixSum,
                map.getOrDefault(prefixSum, 0) + 1
            );
            System.out.println(map.getOrDefault(prefixSum, 0) + 1);
            
        }

        return count;
    }

  public static void main (String[] args){
    int [] nums = { 8,9,2,1,1,2,3,5,6,2};
    int target= 8;

    int result=subarraySum(nums,target);

    System.out.println(result);
  }
}