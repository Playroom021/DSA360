import java.util.*;

class StockSpanProblem {
//     Problem: Given daily stock prices, calculate the stock span for each day.

// The stock span is the number of consecutive days (including today) for which the stock price was less than or equal to today's price.

// Example:
// prices = [100, 80, 60, 70, 60, 75, 85]


// Expected output:
// [1, 1, 1, 2, 1, 4, 6]

    public static int[] calculateSpan(int[] prices) {

        int n = prices.length;

        int[] span = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() &&
                   span[i]>stack.peek()) {

                stack.pop();
            }

            if (stack.isEmpty()) {

                span[i] = i+1;

            } else {

                span[i] = i- stack.peek();
            }

            stack.push(i);
        }

        return span;
    }
}