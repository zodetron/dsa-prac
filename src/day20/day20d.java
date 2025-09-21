package day20;

public class day20d {

        public int trap(int[] height) {
            int left = 0;
            int right = height.length - 1;

            int total = 0;
            int leftMax = height[0];
            int rightMax = height[right];

            while (left < right) {
                if (height[left] < height[right]) {
                    leftMax = Math.max(leftMax, height[left]);
                    total += leftMax - height[left];
                    left++;
                } else {
                    rightMax = Math.max(rightMax, height[right]);
                    total += rightMax - height[right];
                    right--;
                }
            }
            return total;
        }

    public static void main(String[] args) {
            day20d sol = new day20d();

        int[] height1 = {0,1,0,2,1,0,1,3,2,1,2,1};
        int[] height2 = {4,2,0,3,2,5};

        System.out.println(sol.trap(height1)); // Output: 6
        System.out.println(sol.trap(height2)); // Output: 9
    }
}
