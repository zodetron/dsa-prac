package day19;

public class day19a {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j <= i + k && j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        return true;
                    }
                }
            }
            return false;
        }

        // Main method to test
        public static void main(String[] args) {
            day19a sol = new day19a();

            int[] nums1 = {1, 2, 3, 1};
            System.out.println(sol.containsNearbyDuplicate(nums1, 3)); // true

            int[] nums2 = {1, 0, 1, 1};
            System.out.println(sol.containsNearbyDuplicate(nums2, 1)); // true

            int[] nums3 = {1, 2, 3, 1, 2, 3};
            System.out.println(sol.containsNearbyDuplicate(nums3, 2)); // false
        }
}
