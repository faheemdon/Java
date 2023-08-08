package Java;

import java.util.Scanner;

public class DataConversion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //string to int
        String s1 = "10";
        String s2 = "20";

        int i1 = Integer.parseInt(s1);
        System.out.println(Integer.parseInt(s1));

        // string to double
         double d1 = Double.parseDouble(s2);
        System.out.println(Double.parseDouble(s2));

         //int to string
        int i2 = 30;
        String s3 = String.valueOf(i2);
        System.out.println(String.valueOf(i2));

    }
}
