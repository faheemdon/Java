import java.util.Scanner;

public class Exceptionaldemo {
    public static void main(String[] args) {

        System.out.println("Program is Started..");
        System.out.println("Program is in progress....");
        //example1
       /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number..");
        int num = sc.nextInt();
        System.out.println(100/num);
        System.out.println("Program is Completed");
        System.out.println("Exit");
        */

        //example 2

        /*
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        System.out.println("Enter Position(0-4): ");
        int pos = sc.nextInt();
        a[pos] = num;
        System.out.println(a[pos]);
        System.out.println("Program is Completed");
        System.out.println("Exit");
        */

        //example 3

        String s1 = "123";

        int num = Integer.parseInt(s1);
        System.out.println(num);




    }
}
