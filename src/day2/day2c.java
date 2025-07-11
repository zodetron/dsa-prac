package day2;

public class day2c {
    public static void main(String[] args) {

        int n=5;

        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<n-i;j++){
                System.out.print(" ");
            }

            //numbers
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }

            //next line
            System.out.println();
        }
    }
}
