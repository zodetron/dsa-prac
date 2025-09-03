package day17;
//LeetCode 26 – Remove Duplicates from Sorted Array

public class day17c {

        public static int removeDuplicates(int[] nums) {
            if (nums.length == 0) return 0;

            int i = 0; // last unique element
            for (int j = 1; j < nums.length; j++) {
                if (nums[j] != nums[i]) {
                    i++;
                    nums[i] = nums[j];
                }
            }
            return i + 1;
        }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int newLength = removeDuplicates(nums);

        System.out.println("New length: " + newLength);

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
        // Expected Output:
        // New length: 5
        // Array after removing duplicates: 0 1 2 3 4
    }

}
