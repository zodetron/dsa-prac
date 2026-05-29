package CRT;

public class day3b {
    public static void main(String[] args) {
        int totalRows = 7;
        int currentStart = 1;

        for (int i = 1; i <= totalRows; i++) {
            int nextStartSum = 0;

            // 1. Print leading spaces to create the triangular shape
            for (int space = 1; space <= totalRows - i; space++) {
                System.out.print("  ");
            }

            // Generate, print, and process each number in the current row
            for (int j = 0; j < i; j++) {
                int num = currentStart + j;

                // 2. Use printf to ensure uniform spacing (2-digit width) so the triangle doesn't warp
                System.out.printf("%2d  ", num);

                // Mathematically extract and sum the digits of the current number
                int temp = num;
                while (temp > 0) {
                    nextStartSum += temp % 10;
                    temp /= 10;
                }
            }
            // Move to the next line for the next row
            System.out.println();

            // Set the start for the next iteration
            currentStart = nextStartSum;
        }
    }
}
