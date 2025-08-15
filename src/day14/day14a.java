package day14;

public class day14a {
        public static int binarySearch(int[] arr, int target) {
            int low = 0;
            int high = arr.length - 1;

            while (low <= high) {
                int mid = low + (high - low) / 2; // avoids overflow

                if (arr[mid] == target) {
                    return mid; // target found
                }
                if (arr[mid] < target) {
                    low = mid + 1; // search right half
                } else {
                    high = mid - 1; // search left half
                }
            }
            return -1; // target not found
        }

        public static void main(String[] args) {
            int[] arr = {2, 5, 8, 12, 16, 23, 38, 45, 56, 72};
            int target = 23;

            int result = binarySearch(arr, target);
            if (result != -1) {
                System.out.println("Element found at index: " + result);
            } else {
                System.out.println("Element not found");
            }
        }

}
