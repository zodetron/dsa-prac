package day4;
import java.util.*;

public class day4b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int exArray []=new int [size];
        System.out.println("Enter elements of the array: ");
        for(int i=0;i<size;i++){
            exArray[i]=sc.nextInt();
        }
        System.out.println("Searching for the number 7: ");
        for(int i=0;i<size;i++){
            if(exArray[i]==7){
                System.out.println("Element found at: "+ i);
            }
        }
    }
}
