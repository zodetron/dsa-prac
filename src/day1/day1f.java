package day1;
import java.util.*;

public class day1f {
    public static void main(String[] args) {
        int n=4,m=4;


        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
