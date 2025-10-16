package day24;
//leetcode 853. Car Fleet
import java.util.*;

public class day24f {
        public int carFleet(int target, int[] position, int[] speed) {
            int n = position.length;
            int[][] pair = new int[n][2];

            for (int i = 0; i < n; i++) {
                pair[i][0] = position[i];
                pair[i][1] = speed[i];
            }

            // Sort cars by position (descending)
            Arrays.sort(pair, (a, b) -> Integer.compare(b[0], a[0]));

            Stack<Double> stack = new Stack<>();

            for (int[] p : pair) {
                double time = (double) (target - p[0]) / p[1];
                stack.push(time);

                // If a car catches up to the previous one, they form one fleet
                if (stack.size() >= 2 && stack.peek() <= stack.get(stack.size() - 2)) {
                    stack.pop();
                }
            }

            return stack.size();
        }

        public static void main(String[] args) {
            day24f sol = new day24f();

            int target = 12;
            int[] position = {10, 8, 0, 5, 3};
            int[] speed = {2, 4, 1, 1, 3};

            System.out.println("Number of car fleets: " + sol.carFleet(target, position, speed));
        }
}
