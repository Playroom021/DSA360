import java.util.HashSet;

class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for (int num : set) {

            // Start counting only at the beginning
            // of a consecutive sequence.
            if (!set.contains(num - 1)) {

                int current = num;
                int length = 1;

                while (current != Integer.MAX_VALUE
                        && set.contains(current + 1)) {
                    current++;
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;
    }
  public static void main (String[] args){
    int [] nums = { 8,9,2,1,1,2,3,5,6,2};
    int target= 4;

    int result=longestConsecutive(nums);

    System.out.println(result);
  }
  
}