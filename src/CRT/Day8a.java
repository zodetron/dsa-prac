package CRT;
// reversing array with two pointers

public class Day8a {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};

        int left = 0;
        int right = arr.length - 1;
        int temp;

        while (left < right) {

            temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;

            left++;
            right--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}