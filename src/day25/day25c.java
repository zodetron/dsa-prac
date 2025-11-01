package day25;
import java.util.Scanner;
//find greatest of three

public class day25c {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int greatest;

            if (a >= b && a >= c) {
                greatest = a;
            } else if (b >= a && b >= c) {
                greatest = b;
            } else {
                greatest = c;
            }

            System.out.println(greatest);

            sc.close();
        }
}
