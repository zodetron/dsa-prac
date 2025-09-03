package day17;
import java.util.*;

//LeetCode 15 – 3Sum

public class day17e {
        public static List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);
            List<List<Integer>> res = new ArrayList<>();

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > 0) break;
                if (i > 0 && nums[i] == nums[i - 1]) continue;

                int l = i + 1, r = nums.length - 1;
                while (l < r) {
                    int sum = nums[i] + nums[l] + nums[r];
                    if (sum > 0) {
                        r--;
                    } else if (sum < 0) {
                        l++;
                    } else {
                        res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                        l++;
                        r--;
                        while (l < r && nums[l] == nums[l - 1]) {
                            l++;
                        }
                    }
                }
            }
            return res;
        }

        public static void main(String[] args) {
            int[] nums = {-1, 0, 1, 2, -1, -4};
            List<List<Integer>> result = threeSum(nums);

            System.out.println("Triplets that sum to zero:");
            for (List<Integer> triplet : result) {
                System.out.println(triplet);
            }
            // Expected Output:
            // [-1, -1, 2]
            // [-1, 0, 1]
        }
}
