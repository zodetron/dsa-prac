package day3;
import java.util.*;

public class day3a {

    public static void printmyName(String name){
        System.out.println(name);
        return;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name= sc.next();

        printmyName(name);
    }
}
