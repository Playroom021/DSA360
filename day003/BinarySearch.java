package day003;

// What is Binary Search?

// Binary Search is an algorithm used to search an element in a sorted array.
// Instead of checking every element (Linear Search), Binary Search repeatedly divides the search space into half.

// Time Complexity

// - Best: O(1)
// - Average: O(log n)
// - Worst: O(log n)

public class BinarySearch {

    static int search(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == target)
                return mid;

            if (target < arr[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {2,4,6,8,10,12};

        System.out.println(search(arr,10));
    }
}