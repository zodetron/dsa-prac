package day8;

import java.util.Arrays;

public class day8g {
    public int[] productExceptSelf(int[] nums) {
        int []answer = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int product = 1;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==0){
                    product=0;
                }
                else if(nums[i]!=nums[j]){
                    product*=nums[j];
                }
            }
            answer[i]=product;
        }
        return answer;
    }
    public static void main(String[] args) {
        day8g sol = new day8g();
        int[] nums = {0,0};
        int[] result = sol.productExceptSelf(nums);
        System.out.println(Arrays.toString(result));
    }
}
