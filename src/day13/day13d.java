package day13;

public class day13d {

        public int maxArea(int[] heights) {
            int l = 0;
            int r = heights.length - 1;
            int res = 0;

            while (l < r) {
                int area = Math.min(heights[l], heights[r]) * (r - l);
                res = Math.max(res, area);
                if (heights[l] <= heights[r]) {
                    l++;
                } else {
                    r--;
                }
            }
            return res;
        }

        public static void main(String[] args) {
            day13d sol = new day13d();

            int[] heights = {1,8,6,2,5,4,8,3,7};
            System.out.println("Maximum area: " + sol.maxArea(heights)); // Expected: 49
        }
}

