package day2;

public class day2b {
    public static void main(String[] args) {
        int n=5;

        for(int i=1;i<=n;i++){

            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            //stars
            for(int k=0;k<6;k++){
                System.out.print("*");
            }

            //next line
            System.out.println();
        }
    }
}
