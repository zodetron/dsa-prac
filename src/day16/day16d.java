package day16;
import java.util.*;

public class day16d {
    public int largestRectangleArea(int[] heights) {
            Stack<Integer> stack = new Stack<>();
            int maxArea = 0;
            int n = heights.length;

            for (int i = 0; i <= n; i++) {
                int h = (i == n ? 0 : heights[i]); // add a 0 height at the end

                // Process while current height < top of stack
                while (!stack.isEmpty() && h < heights[stack.peek()]) {
                    int height = heights[stack.pop()];
                    int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                    maxArea = Math.max(maxArea, height * width);
                }

                stack.push(i);
            }

            return maxArea;
        }
    public static void main(String[] args) {
        day16d sol = new day16d();

        int[] heights = {2, 1, 5, 6, 2, 3};
        int result = sol.largestRectangleArea(heights);

        System.out.println("Largest Rectangle Area = " + result); // Expected: 10
    }
}
