package Phase1_Day3;
//Stack Q4
// LeetCode 739

import java.util.Stack;
import java.util.Arrays;

public class day3c {

    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];

        // store indices
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                res[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }
        return res;
    }




    public static void main(String[] args) {
        day3c sol = new day3c();
        int[] temps = {73, 74, 75, 71, 69, 72, 76, 73};

        int[] ans = sol.dailyTemperatures(temps);
        System.out.println(Arrays.toString(ans));
    }
}
