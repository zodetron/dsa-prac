package day3;
//returns greatest
import java.util.*;

public class day3e {
    public static int greatest(int a,int b){
        if(a>b){
            return a;
        }else {return b; }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println("the greatest number of all time is 😂... : "+greatest(a,b));

    }
}
