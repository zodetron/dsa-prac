package day15;
//koko eating bananassssssss
//medium for binary search
public class day15a {
        public int minEatingSpeed(int[] piles, int h) {
            // Find the maximum pile (upper bound of speed)
            int maxPile = 0;
            for (int pile : piles) {
                maxPile = Math.max(maxPile, pile);
            }

            // Brute force: try every speed from 1 to maxPile
            for (int k = 1; k <= maxPile; k++) {
                int hours = 0;
                for (int pile : piles) {
                    // Ceiling division without Math.ceil
                    hours += (pile + k - 1) / k;
                }
                if (hours <= h) {
                    return k;
                }
            }
            return maxPile; // fallback
        }

        public static void main(String[] args) {
            day15a sol = new day15a();
            int[] piles = {3, 6, 7, 11};
            int h = 8;

            System.out.println(sol.minEatingSpeed(piles, h)); // Output: 4
        }
    }


