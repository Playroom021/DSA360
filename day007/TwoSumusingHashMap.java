package day007;
import java.util.HashMap;
public class TwoSumusingHashMap {

    // Problem: Given an array nums and a target,
    //  return the indices of two numbers whose sum equals the target.

    public static int [] TwoSum(int [] nums, int target){
        HashMap<Integer,Integer>  map= new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int needed = target - nums[i];

            if (map.containsKey(needed)) {
                return new int[] {map.get(needed), i};
            }

            map.put(nums[i], i);
        }

        return new int[] {-1, -1};
    }

    public static void main (String[] args){

        int [] nums ={2, 7, 11, 15};

        int [] result=TwoSum(nums,9);
        System.out.println (result[0] + " " + result[1]);
    }

}
