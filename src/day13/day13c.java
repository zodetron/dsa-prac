package day13;

public class day13c {

            public int maxArea(int[] heights) {
                int res = 0;
                for (int i = 0; i < heights.length; i++) {
                    for (int j = i + 1; j < heights.length; j++) {
                        res = Math.max(res, Math.min(heights[i], heights[j]) * (j - i));
                    }
                }
                return res;
            }

            public static void main(String[] args) {
                day13c sol = new day13c();

                // Example test case
                int[] heights = {1,8,6,2,5,4,8,3,7};
                System.out.println("Maximum area: " + sol.maxArea(heights)); // Expected: 49
            }

}
