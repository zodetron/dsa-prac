package day25;
import java.util.Scanner;
// greatest of 3 using math.max lib

public class day25d {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int greatest = Math.max(a, Math.max(b, c));

            System.out.println(greatest);

            sc.close();
        }
    }
