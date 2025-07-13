package day3;
import java.util.*;

public class day3c {

    public static int Multi(int a,int b){
        return a*b;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();

        System.out.println("multiplication is: "+ Multi(a,b));
    }
}
