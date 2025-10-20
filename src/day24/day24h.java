package day24;
import java.util.*;
//leetcode 84. Largest Rectangle in Histogram

public class day24h {

        public static int largestRectangleArea(int[] heights) {
            int n = heights.length;
            int maxArea = 0;
            Deque<Integer> stack = new ArrayDeque<>();

            for (int i = 0; i <= n; i++) {
                int currHeight = (i == n) ? 0 : heights[i];

                // If the current bar is smaller, pop and calculate
                while (!stack.isEmpty() && currHeight < heights[stack.peek()]) {
                    int height = heights[stack.pop()];
                    int rightBoundary = i;
                    int leftBoundary = stack.isEmpty() ? -1 : stack.peek();
                    int width = rightBoundary - leftBoundary - 1;
                    maxArea = Math.max(maxArea, height * width);
                }
                stack.push(i);
            }

            return maxArea;
        }

        public static void main(String[] args) {
            int[] heights = {2, 1, 5, 6, 2, 3};
            System.out.println(largestRectangleArea(heights));  // Output: 10
        }
}
