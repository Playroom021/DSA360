package day007;

import java.util.HashSet;

// Problem: Given an integer array,
        //  return true if any value appears at least twice.
        //  Otherwise, return false.

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }

            set.add(num);
        }

        return false;
    }

    public static void main (String [] args ){
        int [] nums ={1, 2, 3, 1};
        System.out.println( containsDuplicate(nums));
    }

}
