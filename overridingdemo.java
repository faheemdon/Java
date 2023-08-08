
class Vegetables{

    String Colour(String Colour)
        {
            System.out.println("Vegetables colour");
            return Colour;

    }
}
class Tomato extends Vegetables
{
    String Colour(String Colour)
    {
       Colour = "red";
       return Colour;

    }
}

class Baigan extends Vegetables
{
   String Colour(String Colour)
   {
       Colour = "Brinjal";
       return Colour;
   }
}
public class overridingdemo {

    public static void main(String[] args) {
        Baigan bg = new Baigan();
        System.out.println(bg.Colour("red"));
        System.out.println( bg.Colour("Brinjal"));

    }
}
