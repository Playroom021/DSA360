import java.util.*;

public class Revision10 {

  public static int [] TwoSum(int [] nums, int target){
    HashMap<Integer,Integer> map = new HashMap<>();

    for(int i =0;i<nums.length ;i++ ){
      int complement = target - nums[1];

      if(map.containsKey(complement)){
        return new int []{map.get(complement),i};
  
      }
      map.put(nums[i],i);
    }
    return new int []{};
  }

  public static int MaxSumSubArray(int[] arr,int k){
    int windowSum= 0;
    for(int i=0; i<k ; i++){
      windowSum+= arr[i];
    }
    int maxSum=windowSum;

    for(int i=k;i <arr.length;i++){
      windowSum+= arr[i] - arr[k-i];
      maxSum=Math.max(maxSum,windowSum);
    }
    return maxSum;
  }

  
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 2};

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        System.out.println(freq);

        int [] nums ={2, 7, 11, 15};
        int target =9;
        int [] result=TwoSum(nums,target);
        System.out.println(result);
    }
}