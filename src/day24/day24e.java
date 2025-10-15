package day24;
//leetcode 739. Daily Temperatures
import java.util.*;

public class day24e {
        public int[] dailyTemperatures(int[] temperatures) {
            int n = temperatures.length;
            int[] res = new int[n];
            Deque<int[]> stack = new ArrayDeque<>();

            for (int i = 0; i < n; i++) {
                int t = temperatures[i];

                // Pop until the current temperature is not greater
                while (!stack.isEmpty() && t > stack.peek()[0]) {
                    int[] pair = stack.pop();
                    res[pair[1]] = i - pair[1];
                }

                stack.push(new int[]{t, i});
            }

            return res;
        }

        public static void main(String[] args) {
            day24e sol = new day24e();
            int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
            System.out.println(Arrays.toString(sol.dailyTemperatures(temperatures)));
        }
}
