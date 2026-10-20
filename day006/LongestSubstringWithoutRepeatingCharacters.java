package day006;

// Problem: Given a string, find the length of its longest substring containing no repeated characters.

// Example:
// Input:  "abcabcbb"
// Output: 3

// The longest substring is "abc".

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int longestSubstring(String string){

        Set<Character> seen = new HashSet<>();

        int left =0;
        int maxLength=0;

        for(int right=0; right < string.length() ;right++){
            char current = string.charAt(right);
            
            while(seen.contains(current)){
                seen.remove(string.charAt(left));
                left++;
            }

            seen.add(current);

            maxLength = Math.max(
                maxLength, right - left + 1
            );
        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(
            longestSubstring("abcabcbb")
        );
    }
    

}
