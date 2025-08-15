package day14;

public class day14b {
        public static int binarySearch(int[] arr, int low, int high, int target) {
            if (low > high) {
                return -1; // base case: not found
            }

            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                return binarySearch(arr, mid + 1, high, target); // right half
            } else {
                return binarySearch(arr, low, mid - 1, target); // left half
            }
        }

        public static void main(String[] args) {
            int[] arr = {2, 5, 8, 12, 16, 23, 38, 45, 56, 72};
            int target = 23;

            int result = binarySearch(arr, 0, arr.length - 1, target);
            if (result != -1) {
                System.out.println("Element found at index: " + result);
            } else {
                System.out.println("Element not found");
            }
        }

}
