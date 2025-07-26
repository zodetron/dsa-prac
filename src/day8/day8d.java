package day8;

public class day8d  {

}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int maxCount=0;
        int maxElement=nums[0];

        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()>maxCount){
                maxCount=entry.getValue();
                maxElement=entry.getKey();
            }
        }
        return new int[]{maxElement};
    }
}
