package day3;
import java.util.*;

public class day3g {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers you want to input: ");
        int n = sc.nextInt();

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        System.out.println("Enter the numbers:");

        for (int i = 1; i <= n; i++) {
            int num = sc.nextInt();
            System.out.println("You entered: " + num);

            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println("\nSummary:");
        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
        System.out.println("Zeros: " + zeroCount);
    }
}
