package day12;
import java.util.Stack;

public class day12c {
        public int[] dailyTemperatures(int[] temperatures) {
            int[] res = new int[temperatures.length];
            Stack<int[]> stack = new Stack<>(); // pair: [temperature, index]

            for (int i = 0; i < temperatures.length; i++) {
                int t = temperatures[i];
                while (!stack.isEmpty() && t > stack.peek()[0]) {
                    int[] pair = stack.pop();
                    res[pair[1]] = i - pair[1];
                }
                stack.push(new int[]{t, i});
            }
            return res;
        }

        public static void main(String[] args) {
            day12c sol = new day12c();
            int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
            int[] result = sol.dailyTemperatures(temperatures);

            System.out.print("Result: [");
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i]);
                if (i < result.length - 1) System.out.print(", ");
            }
            System.out.println("]");
        }

}
