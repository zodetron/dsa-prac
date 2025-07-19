package day5;
import java.util.*;

public class day5e {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("zodetron");
        System.out.println(sb);

        //print char at index 0
        System.out.println(sb.charAt(0));

        //set char at index
        sb.setCharAt(0,'P');
        System.out.println(sb);

        sb.insert(6,'y');
        System.out.println(sb);

        //delete extra
        sb.delete(2,3);
        System.out.println(sb);

    }
}
