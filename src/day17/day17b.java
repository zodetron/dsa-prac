package day17;

public class day17b {

        public int removeElement(int[] nums, int val) {
            int i = 0; // position for next valid element
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] != val) {
                    nums[i] = nums[j];
                    i++;
                }
            }
            return i;
        }
    public static void main(String[] args) {
        day17b sol = new day17b();

        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int newLength = sol.removeElement(nums, val);

        System.out.println("New length: " + newLength);

        System.out.print("Array after removal: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
        // Expected Output:
        // New length: 2
        // Array after removal: 2 2
    }
}
