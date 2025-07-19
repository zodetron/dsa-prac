package day5;

public class day5c {
    public static void main(String[] args) {
        //compare
        String xyz1="hardik 123";
        String xyz2="hardik 123";

        //1 s1>s2 : +ve value
        //2 s1==s2 : 0
        //3 s1<s2 : -ve value

        if(xyz1.compareTo(xyz2)==0){
            System.out.println("Strings are equal ");
        }else{
            System.out.println("Strings are not equal ");
        }
    }
}
