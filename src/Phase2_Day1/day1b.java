package Phase2_Day1;

public class day1b {
    public int maxSubArray(int[] nums) {
        int realMax = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];

                if (sum > realMax) {
                    realMax = sum;
                }
            }
        }
        return realMax;
    }
    public static void main(String[] args) {

        day1b obj = new day1b();

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int ans = obj.maxSubArray(nums);

        System.out.println("Maximum Subarray Sum: " + ans);
    }
}
