package day20;
import java.util.Scanner;

public class day20e {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("================================");
            for (int i = 0; i < 3; i++) {
                String s = sc.next();
                int x = sc.nextInt();
                System.out.printf("%-15s%03d%n", s, x);
            }
            System.out.println("================================");

            sc.close();
        }

}
