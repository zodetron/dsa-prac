package day5;
import java.util.*;

public class day5a {
    public static void main(String[] args) {

        //String Declaration
//        String name="Hardik";
//        String fullName="zodetron";
//        String sentence="my name is zodetron";
        Scanner sc=new Scanner(System.in);
        String firstName=sc.nextLine() ;
        System.out.println("your name is: "+firstName);

        String lastName = "zodetron";
        String fullName = firstName + lastName;
        System.out.println("full name is:  "+ fullName);

    }
}
