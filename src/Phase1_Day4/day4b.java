package Phase1_Day4;
//Binary Search Q2
//LeetCode 74. Search a 2D Matrix
//You are given an m x n integer matrix matrix with the following two properties:
//
//        Each row is sorted in non-decreasing order.
//        The first integer of each row is greater than the last integer of the previous row.
//        Given an integer target, return true if target is in matrix or false otherwise.
//
//        You must write a solution in O(log(m * n)) time complexity.
//Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
//        Output: true

import java.util.*;

class day4b {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;      // rows
        int n = matrix[0].length;   // cols

        int left = 0;
        int right = m * n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = matrix[mid / n][mid % n];

            if (midValue == target) {
                return true;
            } else if (midValue > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        day4b sol = new day4b();

        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        int target = 16;
        System.out.println(sol.searchMatrix(matrix, target)); // Expected: true

        int target2 = 13;
        System.out.println(sol.searchMatrix(matrix, target2)); // Expected: false
    }
}
