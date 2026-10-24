import java.util.*;

public class PracticeQuestions{

// Question 1: Contains Duplicate

// Given an integer array, return true if any value appears at least twice; otherwise, return false.

// Example:
// Input:  [1, 2, 3, 1]
// Output: true

// Hint: Use a HashSet.
  
  public static boolean ContainsDuplicate( int [] nums){
    HashSet<Integer> set =new HashSet<>();

    for(int num :nums){
      if(!set.add(num)){
        return true;
      }
    }
    return false;
  }

//   Question 2: Valid Anagram

// Given two strings s and t, determine whether t is an anagram of s.

// An anagram contains exactly the same characters with the same frequencies, but possibly in a different order.

// Example:
// Input:
// s = "anagram"
// t = "nagaram"

// Output: true

// Hint: Use a HashMap to count character frequencies, or use a frequency array if the input is restricted to lowercase English letters.

  public static boolean ValidAnagram(String s, String t ){
    
  }

  public static void main(String [] args){
    int [] num1={1,2,3,1};
    System.out.println(ContainsDuplicate(num1));

    
  }
}