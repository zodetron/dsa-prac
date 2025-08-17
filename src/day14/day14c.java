package day14;

public class day14c {
        public boolean searchMatrix(int[][] matrix, int target) {
            int m = matrix.length;     // rows
            int n = matrix[0].length;  // cols

            int left = 0;
            int right = m * n - 1;

            while (left <= right) {  // loop until search space is empty
                int mid = left + (right - left) / 2;
                int midValue = matrix[mid / n][mid % n]; // map 1D index -> 2D element

                if (midValue == target) {
                    return true; // found
                } else if (midValue > target) {
                    right = mid - 1; // search left half
                } else {
                    left = mid + 1; // search right half
                }
            }
            return false; // not found
        }

        // ✅ Main method for testing
        public static void main(String[] args) {
            day14c sol = new day14c();

            int[][] matrix = {
                    {1, 3, 5, 7},
                    {10, 11, 16, 20},
                    {23, 30, 34, 60}
            };

            int target1 = 3;
            int target2 = 13;

            System.out.println("Searching for " + target1 + ": " + sol.searchMatrix(matrix, target1)); // true
            System.out.println("Searching for " + target2 + ": " + sol.searchMatrix(matrix, target2)); // false
        }
    }

