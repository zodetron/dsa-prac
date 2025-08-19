class day15d {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;

        // Find pivot (smallest element index)
        while (l < r) {
            int m = (l + r) / 2;
            if (nums[m] > nums[r]) {
                l = m + 1;
            } else {
                r = m;
            }
        }

        int pivot = l;

        // Search in left half
        int result = binarySearch(nums, target, 0, pivot - 1);
        if (result != -1) {
            return result;
        }

        // Search in right half
        return binarySearch(nums, target, pivot, nums.length - 1);
    }

    public int binarySearch(int[] nums, int target, int left, int right) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
        public static void main(String[] args) {
            day15d sol = new day15d();

            int[] nums = {4, 5, 6, 7, 0, 1, 2};
            int target = 0;

            int result = sol.search(nums, target);

            if (result != -1) {
                System.out.println("Target found at index: " + result);
            } else {
                System.out.println("Target not found");
            }
        }
}
