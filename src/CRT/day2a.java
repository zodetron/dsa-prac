package CRT;
import java.util.*;

public class day2a {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int i=4;
        int k=0;
        for(i=1;i<=4;i++){
            for(int j=k;j<=i-1;j++) {
                System.out.print(arr[j] + " ");
            }
            if(i==4 && k<4){
                k++;
                i=k;
            }
            System.out.println();
        }
    }
}
