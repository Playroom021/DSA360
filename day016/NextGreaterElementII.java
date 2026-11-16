import java.util.*;

class NextGreaterElementII {

    public static int[] Solution(int[] arr) {

        int n = arr.length;

        int[] ans = new int[n];

        Arrays.fill(ans, -1);

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < 2 * n; i++) {

            int index = i % n;

            while (!stack.isEmpty()&& 
                   arr[index] > arr[stack.peek()]) {

                int previousIndex = stack.pop();

                ans[previousIndex] = arr[index];
            }

            if (i < n) {
                stack.push(index);
            }
        }

        return ans;
    }
}