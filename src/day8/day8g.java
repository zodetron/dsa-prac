package day8;

import java.util.Arrays;

public class day8g {
        public int[] productExceptSelf(int[] nums) {
            int []answer = new int [nums.length];
            for(int i=0;i<nums.length;i++){
                for(int j=0;j<nums.length;j++){
                    if(i!=j){
                        answer[i]=i*j;
                    }
                }
            }
            return answer;
        }
    public static void main(String[] args) {
        day8g sol = new day8g();
        int[] nums = {1,2,3,4};
        int[] result = sol.productExceptSelf(nums);
        System.out.println(Arrays.toString(result));
    }
}
