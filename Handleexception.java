import java.util.Scanner;

public class Handleexception {
    public static void main(String[] args) {
        System.out.println("Program is Started..");
        System.out.println("Program is in progress....");
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        try
        {
            System.out.println(100/num);
        }
        catch(ArithmeticException e)
        {
            System.out.println("you have given a invalid number");
            System.out.println( e.getMessage());
        }

        System.out.println("Program is Completed");
        System.out.println("Exit");
    }
}
