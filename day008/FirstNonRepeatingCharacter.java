package day008;

// Problem: Given a string, find the first character that appears exactly once.
// Example
// Input: "aabbcde"

// Output: 'c'

import java.util.HashMap;

public class FirstNonRepeatingCharacter {

    public static char NonRepeatingChar(String s){
        HashMap <Character,Integer> map= new HashMap<>();

        // Step 1: Count character frequencies
        for (char ch : s.toCharArray()) {

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Find the first unique character
        for (char ch : s.toCharArray()) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }

        return '#';

    }

    public static void main(String []args){
         String s = "aabbcde";

        System.out.println(NonRepeatingChar(s));

    }
}
