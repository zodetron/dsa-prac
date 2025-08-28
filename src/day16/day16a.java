package day16;
import java.util.*;

public class day16a {
        public int carFleet(int target, int[] position, int[] speed) {
            int[][] pair = new int[position.length][2];

            // Create (position, speed) pairs
            for (int i = 0; i < position.length; i++) {
                pair[i][0] = position[i];
                pair[i][1] = speed[i];
            }

            // Sort by position descending (cars closer to target first)
            Arrays.sort(pair, (a, b) -> Integer.compare(b[0], a[0]));

            Stack<Double> stack = new Stack<>();

            for (int[] p : pair) {
                // Time to reach target = (distance / speed)
                stack.push((double) (target - p[0]) / p[1]);

                // If current car catches up with the fleet ahead, merge them
                if (stack.size() >= 2 && stack.peek() <= stack.get(stack.size() - 2)) {
                    stack.pop(); // merge into the previous fleet
                }
            }

            return stack.size(); // number of fleets
        }
    public static void main(String[] args) {
        day16a sol = new day16a();

        int target = 12;
        int[] position = {10, 8, 0, 5, 3};
        int[] speed = {2, 4, 1, 1, 3};

        int fleets = sol.carFleet(target, position, speed);
        System.out.println("Number of car fleets: " + fleets);
    }
}
