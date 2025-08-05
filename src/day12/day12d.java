package day12;
import java.util.Stack;
import java.util.Arrays;

public class day12d {

        public int carFleet(int target, int[] position, int[] speed) {
            int[][] pair = new int[position.length][2];
            for (int i = 0; i < position.length; i++) {
                pair[i][0] = position[i];
                pair[i][1] = speed[i];
            }

            Arrays.sort(pair, (a, b) -> Integer.compare(b[0], a[0]));

            Stack<Double> stack = new Stack<>();
            for (int[] p : pair) {
                double time = (double) (target - p[0]) / p[1];
                stack.push(time);
                if (stack.size() >= 2 && stack.peek() <= stack.get(stack.size() - 2)) {
                    stack.pop();
                }
            }

            return stack.size();
        }

        public static void main(String[] args) {
            day12d sol = new day12d();
            int target = 12;
            int[] position = {10, 8, 0, 5, 3};
            int[] speed = {2, 4, 1, 1, 3};

            int result = sol.carFleet(target, position, speed);
            System.out.println("Number of car fleets: " + result);
        }


}
