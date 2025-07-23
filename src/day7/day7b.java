// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
package day7;
import java.util.*;

public class day7b{
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;}
            set.add(nums[i]);
        }
        return false;
    }




public static void main(String[] args) {
        day7b obj = new day7b();
        int arr[] = {43, 5, 6, 743, 2, 4,};

        boolean result = obj.containsDuplicate(arr);
        System.out.println(result);  // Output: true
    }
}
