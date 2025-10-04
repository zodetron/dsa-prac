package day23;
//package 23 is the complete folder for revision of Arrays and HashSets and HashMaps
import java.util.HashSet;

public class day23a {
    public boolean checkDup(int[]nums) {
        HashSet<Integer> setabc = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
         if(setabc.contains(nums[i])){
             return true;
         }
         setabc.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        day23a sol=new day23a();
        boolean result = sol.checkDup(new int[]{1, 2, 3, 4, 4, 6});
        System.out.println(result);
    }
}
