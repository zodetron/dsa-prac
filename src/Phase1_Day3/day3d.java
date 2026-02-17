package Phase1_Day3;
//Stack Q5
//LeetCode 859

import java.util.*;

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        int[][] cars = new int[n][2];

        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        // sort by position descending
        Arrays.sort(cars, (a, b) -> b[0] - a[0]);

        Stack<Double> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            double time = (double)(target - cars[i][0]) / cars[i][1];

            if (stack.isEmpty() || time > stack.peek()) {
                stack.push(time);   // new fleet
            }
            // else: merges with fleet ahead, do nothing
        }

        return stack.size();
    }


    public static void main(String[] args) {
        Solution sol = new Solution();
        int target = 12;
        int[] position = {10, 8, 0, 5, 3};
        int[] speed = {2, 4, 1, 1, 3};

        System.out.println(sol.carFleet(target, position, speed)); // Expected: 3
    }
}

