import java.util.HashSet;
import java.util.Set;


public class LongestSubstringWithoutRepeatingCharacters{

    public static lengthOfLongestSubstring(String s){
        set<Character> seen =new HashSet<>();
        //for checking repeted character
        int left =0;
        int maxLength=0;

        for(int right =0;right< s.length();right++){
            while (seen.contains(s.charAt(right))){
                seen.remove(s.charAt(left));
                left++;
            }

            seen.add(s.charAt(right));
            maxLength=Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}