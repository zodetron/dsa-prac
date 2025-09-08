package day18;

public class day18b {
        public int searchInsert(int[] nums, int target) {
            int left = 0, right = nums.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (nums[mid] == target) {
                    return mid; // found
                } else if (nums[mid] < target) {
                    left = mid + 1; // target in right half
                } else {
                    right = mid - 1; // target in left half
                }
            }

            return left; // insert position
        }

        public static void main(String[] args) {
            day18b sol = new day18b();
            int[] nums = {1, 3, 5, 6};

            System.out.println(sol.searchInsert(nums, 5)); // 2
            System.out.println(sol.searchInsert(nums, 2)); // 1
            System.out.println(sol.searchInsert(nums, 7)); // 4
            System.out.println(sol.searchInsert(nums, 0)); // 0
        }

}
