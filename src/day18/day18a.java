package day18;

public class day18a {
        public int mySqrt(int x) {
            if (x == 0 || x == 1) return x;

            int left = 1, right = x / 2, ans = 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                long sq = (long) mid * mid; // prevent overflow

                if (sq == x) return mid;
                if (sq < x) {
                    ans = mid;  // store last valid answer
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            return ans;
        }

        public static void main(String[] args) {
            day18a sol = new day18a();
            System.out.println(sol.mySqrt(4)); // 2
            System.out.println(sol.mySqrt(8)); // 2
            System.out.println(sol.mySqrt(1)); // 1
            System.out.println(sol.mySqrt(0)); // 0
        }
}
