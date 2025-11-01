package day25;
import java.util.Scanner;
//check pal
public class day25b {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

            int number = sc.nextInt();
            int original = number;
            int reversed = 0;

            while (number != 0) {
                int digit = number % 10;
                reversed = reversed * 10 + digit;
                number = number / 10;
            }

            if (original == reversed) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }

            sc.close();
        }
}
