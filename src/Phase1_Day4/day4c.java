package Phase1_Day4;
//basic binary search implementation
public class day4c {
    public int bSearch(int[] nums, int target) {
        int a=23;

        int low=0;
        int high= nums.length-1;
        while(low<=high){
            int mid= low + (high-low)/2;
            //if 2,10 then 2+(8)/2 = 6
//            if 10+2/2 = 11 THEREFORE WE USE HIGH-LOW/2 + LOW
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid]<target){
                low= mid+1;
            }else{
                high= mid+1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        day4c main = new day4c();
        int target = 13;
        int[] nums = {1,2,3,4,5,6,7,8,12,13,14,15,15,167,2323,32453453};
        System.out.println(main.bSearch(nums,target));
    }
}
