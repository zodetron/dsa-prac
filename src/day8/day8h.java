package day8;

import java.util.Arrays;

public class day8h {
        public int[] productExceptSelf(int[] nums) {
            int []answer = new int [nums.length];
            for(int x=0;x<nums.length;x++){
                for(int i : nums){
                    for(int j: nums){
                        if(i!=j){

                            answer[x]=i*j;
                        }
                    }
                }

            }
            return answer;
        }
    public static void main(String[] args) {
        day8h sol = new day8h();
        int[] nums = {1,2,3,4};
        int[] result = sol.productExceptSelf(nums);
        System.out.println(Arrays.toString(result));
    }
    }
