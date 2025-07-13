package day3;
import java.util.*;

public class day3b {

    public static void printSum(int a,int b){
        int x=a;
        int y=b;
        int summ = x+y;
        System.out.println(summ);
        return;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();

        printSum(a,b);
    }
}
