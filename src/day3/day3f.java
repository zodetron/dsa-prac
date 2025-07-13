package day3;
import java.util.*;

public class day3f {

    public static void printNum(int n) {

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        //after numbers print positve negative and zeros
        System.out.println();
        int pos=0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                pos++;
            }
        }
        System.out.println("Positive numbers are : "+pos);
        int neg=0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                neg++;
            }
        }
        System.out.println("Negative numbers are : "+neg);
        int xeros=0;
        for(int i=1;i<=n;i++){
            if(i%10==0){
                xeros++;
            }
        }
        System.out.println("Number of zeros are: "+xeros);
        return;
    }


        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            printNum(n);
        }
    }