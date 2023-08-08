import java.sql.SQLOutput;
import java.util.Locale;

public class StringOperation {

    public static void main(String[] args) {
        String s = "welcome";
        //String s = new String("welcome");
        //Length
        System.out.println(s.length());
        //comcat
        String s1 = "Juniad is Good Boy";
        String s2 =" and Mateen is good boy";
        String s3 = " both works in Adroitco with me";
        System.out.println(s1.concat(s2).concat(s3));
        System.out.println(s1.length());
        //System.out.println(s1+s2+s3);
        //trim
        s = "  Junaid lives at Murad Nagar  ";
        System.out.println(s.length());
        System.out.println(s.trim());
        System.out.println(s.trim().length());

        //charact- start with index

        s = "Mateen";
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(3));
        System.out.println(s.charAt(5));

        //contains-true/false
        s = "Mateen is a good boy";
        System.out.println(s.contains("good"));
        System.out.println(s.contains("bad"));

        //equals

      //  s1 = "Mateen is a good boy";
     //   s2 = "mateen is a good boy";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        //replace

        s = "Mateen is a good boy";

        System.out.println(s.replace('0','a' ));
        System.out.println(s.replace("good", "bad"));

        //substring- to extract sub string from main string
        //split- divide the string in to multiple parts using delimter

        s = "mohammedfaheem71@gmail.com";
        String a[] = s.split("@");
        System.out.println(a[0]);
        System.out.println(a[1]);
//uppercase and lower case
        s = "MATEEN IS A GOOD BOY";
        //System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        //equals

        String x1 = "abc";
        String x2 = new String("abc");
        String x3 = new String("cde");
        String x4 = new String("abc");
        
        System.out.println(x1==x2);
        System.out.println(x1.equals(x2));
        System.out.println(x1==x3);
        System.out.println(x1.equals(x4));
        System.out.println(x2==x3);
        System.out.println(x2.equals(x4));




    }
}
