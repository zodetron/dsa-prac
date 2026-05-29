package CRT;
//the given pattern is based on digit sum
/*
1
12
345
12 13 14 15
18 19 20 21 22
28 29 30 31 32 33
 */

import java.util.Scanner;

public class day3a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalRows = sc.nextInt();
        int currentStart = 1;
        for (int i = 1; i <= totalRows; i++) {
            int nextStartSum = 0;

            // Generate, print, and process each number in the current row
            for (int j = 0; j < i; j++) {
                int num = currentStart + j;
                System.out.print(num + (j == i - 1 ? "" : " "));

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

