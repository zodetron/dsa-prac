// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
package day7;
import java.util.*;

public class day7a {
    public boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        day7a obj = new day7a();
        int arr[] = {43, 5, 6, 743, 2, 4,};

        boolean result = obj.containsDuplicate(arr);
        System.out.println(result);  // Output: true
    }
}
