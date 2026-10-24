package day004;

// What is Binary Search?

// Binary Search is an algorithm used to search an element in a sorted array.
// Instead of checking every element (Linear Search), Binary Search repeatedly divides the search space into half.

// Time Complexity

// - Best: O(1)
// - Average: O(log n)
// - Worst: O(log n)


//math lib import 
// import static java.lang.Math.*;

public class kokoEatingBanana {

        public static int minEatingSpeed(int[] piles, int h) {

            int low = 1;
            int high = 0;

            // finding max in pile 
            for (int pile : piles) {
                     high = Math.max(high, pile);
            }

            int answer = high;

            while (low <= high) {

                int mid = low + (high - low) / 2;

                if (canFinish(piles, h, mid)) {
                    answer = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            return answer;
        }

        private static boolean canFinish(int[] piles, int h, int speed) {

            long hours = 0;

            for (int pile : piles) {

                hours += (pile + speed - 1) / speed;

                if (hours > h) {
                    return false;
                }
            }

            return true;
        }


    public static void main(String[] args) {

        int[] arr = {2,4,6,8,10,12};

        System.out.println(minEatingSpeed(arr,10));

        // System.out.println(search(arr,10));
    }
}