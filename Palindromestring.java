public class Palindromestring {
    public static void main(String[] args) {
        String s1 = "principle";
        String Rev = "";

        for(int i =s1.length()-1; i>=0; i++)
        {
            Rev = Rev+s1.charAt(i);
        }
        if(s1.equals(Rev))
        {
            System.out.println("this is palindrome String");
        }

        else

         {
             System.out.println("this is not a palindrome String");
        }

    }
}
