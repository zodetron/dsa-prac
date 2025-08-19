package day15;

public class day15c {
        public static void main(String[] args) {
            Solution sol = new Solution();

            int[] nums = {1, 3, 5, 7, 9};
            int target = 7;

            int result = sol.search(nums, target);

            if (result != -1) {
                System.out.println("Target found at index: " + result);
            } else {
                System.out.println("Target not found");
            }
        }
    }

    class Solution {
        public int search(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target) {
                    return i;
                }
            }
            return -1;
        }
    }
