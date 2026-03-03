package Phase1_Day4;

public class day4d {
        public boolean searchMatrix(int[][] matrix, int target) {

            int m = matrix.length;
            int n = matrix[0].length; // number of columns

            int left = 0;
            int right = m * n - 1;  // imaginary 1D range

            while (left <= right) {

                int mid = left + (right - left) / 2;

                int row = mid / n;
                int col = mid % n;

                int value = matrix[row][col];

                if (value == target) {
                    return true;
                }
                else if (value < target) {
                    left = mid + 1;
                }
                else {
                    right = mid - 1;
                }
            }

            return false;
        }

        // psvm added
        public static void main(String[] args) {

            day4d sol = new day4d();

            int[][] matrix = {
                    {1, 3, 5, 7},
                    {10, 11, 16, 20},
                    {23, 30, 34, 60}
            };

            int target1 = 3;
            int target2 = 13;

            System.out.println(sol.searchMatrix(matrix, target1)); // true
            System.out.println(sol.searchMatrix(matrix, target2)); // false
        }
}
