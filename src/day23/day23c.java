package day23;
import java.util.*;
//leetcode 1
public class day23c {

        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> set1 = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (set1.containsKey(complement)) {
                    return new int[] { set1.get(complement), i };
                }
                set1.put(nums[i], i);
            }
            return new int[] {};
        }

        public static void main(String[] args) {
            day23c sol = new day23c();

            int[] nums = {2, 7, 11, 15};
            int target = 9;

            int[] result = sol.twoSum(nums, target);

            System.out.println("Indices: " + Arrays.toString(result));
        }
}
