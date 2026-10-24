// Problem 2: Longest Substring Without Repeating Characters
// Given a string, find the length of its longest substring containing no repeated characters.

// Example:
// Input: "abcabcbb"
// Output: 3

public class Variable-sizeSlidingWindow{

    public static int lengthOfLongestSubstring(String s ){
        Map<Characters,Integer> lastSeen =new HashMap<>();
        int left =0;
        int maxLength =0;
        for(lastSeen.containsKey(current)){
            left =Math.max(left,lastSeen.get(current)+1);
        }
        lastSeen.put(current,right);

        maxLength=Math.max(
            maxLength,right-left+1
        );
        
        return maxLength;
    }
    public static void main(String[] args) {
        System.out.println(
            lengthOfLongestSubstring("abcabcbb")
        );
    }
}