package Phase1_Day4;
//Binary Search Q1
//LeetCode 704
// Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1
import java.util.*;

class day4a {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    // psvm added
    public static void main(String[] args) {
        day4a sol = new day4a();

        int[] nums = { -1, 0, 3, 5, 9, 12 };
        int target = 9;

        int index = sol.search(nums, target);
        System.out.println(index);  // Expected output: 4
    }
}
