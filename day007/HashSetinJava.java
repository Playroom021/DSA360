package day007;

import java.util.HashSet;

public class HashSetinJava {

    // A HashSet stores unique elements only.
    // If you insert a duplicate, it won't store it again.

    // Useful methods:
        // - set.add(num) — adds an element.
        // - set.contains(num) — checks whether it exists.
        // - set.remove(num) — removes it.
        // - set.size() — returns the number of unique elements.

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1};

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        System.out.println ("");

        System.out.println(set);
    }

}
