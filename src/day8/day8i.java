package day8;
import java.util.*;
//code totally correct but it says time limit exceeded
public class day8i {
        public int[] productExceptSelf(int[] nums) {
            int[] answer = new int[nums.length];

            for (int i = 0; i < nums.length; i++) {
                int product = 1;
                for (int j = 0; j < nums.length; j++) {
                    if (i != j) {
                        product *= nums[j];
                    }
                }
                answer[i] = product;
            }

            return answer;
        }

    public static void main(String[] args) {
        day8i sol = new day8i();
        int[] nums = {0,1,2,3,4};
        int[] result = sol.productExceptSelf(nums);
        System.out.println(Arrays.toString(result));
    }
    }

