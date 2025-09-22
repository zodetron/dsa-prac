package day21;
import java.util.Arrays;

public class day21a {

        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int m = nums1.length, n = nums2.length;
            int[] merged = new int[m + n];
            int i = 0, j = 0, k = 0;

            // Merge both arrays
            while (i < m && j < n) {
                if (nums1[i] < nums2[j]) merged[k++] = nums1[i++];
                else merged[k++] = nums2[j++];
            }
            while (i < m) merged[k++] = nums1[i++];
            while (j < n) merged[k++] = nums2[j++];

            // Find median
            int total = m + n;
            if (total % 2 == 1) {
                return merged[total / 2];
            } else {
                return (merged[total / 2 - 1] + merged[total / 2]) / 2.0;
            }
        }
    public static void main(String[] args) {
        day21a sol = new day21a();

        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println(sol.findMedianSortedArrays(nums1, nums2)); // 2.0

        int[] nums3 = {1, 2};
        int[] nums4 = {3, 4};
        System.out.println(sol.findMedianSortedArrays(nums3, nums4)); // 2.5
    }
}
