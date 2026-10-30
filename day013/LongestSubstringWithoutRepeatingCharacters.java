// Longest Substring Without Repeating Characters

// Given a string, find the length of its longest substring without duplicate characters.

// Example: s = "abcabcbb"

// Expected output: 3

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters{
    public static int longestStringNoRepeate(String s){

        int left =0;
        int maxLength=0;
        HashSet<Character> set = new HashSet<>();
        
        for(int right =0; right<s.length();right++){
            char current= s.charAt(right);
            while(set.contains(current)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(current);
            maxLength= Math.max(maxLength,right-left+1);
            
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";

        System.out.println(longestStringNoRepeate(s));
    }
}