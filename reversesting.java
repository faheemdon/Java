public class reversesting {
    public static void main(String[] args) {

        String s = "Faheem";
        String reversesting = "";

      //  System.out.println(s.length());
        for(int i = s.length()-1; i>=0; i--)
        {
            reversesting = reversesting+s.charAt(i);
        }
        System.out.println(reversesting);
    }
}
