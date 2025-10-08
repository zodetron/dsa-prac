package day23;
//leetcode 128. Longest Consecutive Sequence
import java.util.*;

public class day23h {

    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int res = 0, curr = nums[0], streak = 0, i = 0;

        while (i < nums.length) {
            if (curr != nums[i]) {
                curr = nums[i];
                streak = 0;
            }
            while (i < nums.length && nums[i] == curr) {
                i++;
            }
            streak++;
            curr++;
            res = Math.max(res, streak);
        }
        return res;
    }

    public static void main(String[] args) {
        day23h sol = new day23h();

        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest consecutive sequence: " + sol.longestConsecutive(nums)); // Output: 4

        //returns output in longest string.
    }
}
