package day19;
import java.util.*;

public class day19b {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);

            if (set.size() > k) {
                set.remove(nums[i - k]); // maintain sliding window
            }
        }

        return false;
    }

    // Main method to test
    public static void main(String[] args) {
        day19b sol = new day19b();

        int[] nums1 = {1, 2, 3, 1};
        System.out.println(sol.containsNearbyDuplicate(nums1, 3)); // true

        int[] nums2 = {1, 0, 1, 1};
        System.out.println(sol.containsNearbyDuplicate(nums2, 1)); // true

        int[] nums3 = {1, 2, 3, 1, 2, 3};
        System.out.println(sol.containsNearbyDuplicate(nums3, 2)); // false
    }
}
