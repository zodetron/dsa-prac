package day8;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class day8a {
    public static void main(String[] args) {
//        char[]newArray=new char[4];
//        List[]newArray=('xy','xyz','zxy','yz');

        String str1= ("hi");
        String str2=("hi");
        if(str1==str2){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }



        List<String> words123 = new ArrayList<>(Arrays.asList("xy","xyz","zxy","yz"));

        Collections.sort(words123); // Sorts in ascending order
        List<char[]> groupedChars = new ArrayList<>();

//        for (String str : words123) {
//            words123.add(str.toCharArray());  // Convert each string to char[]
//        }

//        Arrays.words=tocharArray();

        System.out.println(words123);






    }
}
