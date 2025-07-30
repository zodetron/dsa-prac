package day9;
import java.util.Arrays;

public class day9c {


        public int[] productExceptSelf(int[] nums) {
            int prod = 1, zeroCount = 0;

            for (int num : nums) {
                if (num != 0) {
                    prod *= num;
                } else {
                    zeroCount++;
                }
            }

            if (zeroCount > 1) {
                return new int[nums.length]; // All zeros
            }

            int[] res = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                if (zeroCount > 0) {
                    res[i] = (nums[i] == 0) ? prod : 0;
                } else {
                    res[i] = prod / nums[i];
                }
            }

            return res;
        }

        public static void main(String[] args) {
            day9c sol = new day9c();

            int[] nums = {1, 2, 3, 4};  // You can change the input here
            int[] result = sol.productExceptSelf(nums);

            System.out.println("Input: " + Arrays.toString(nums));
            System.out.println("Output: " + Arrays.toString(result));
        }
}
