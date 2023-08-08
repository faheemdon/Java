interface Shape
{
    int length = 10;
    int width = 20;

    void circle();

    default void Square()
    {
        System.out.println("this is default method");

    }

    static void Rectangle()
    {
        System.out.println("this is static method");
    }
}

public class Inheritencedemo implements Shape {

    public void circle(){
        System.out.println("this is circle");

    }

    public static void main(String[] args) {

        Inheritencedemo idobj = new Inheritencedemo();
        //idobj.circle();
        //idobj.Square();
        //Shape.Rectangle();

        Shape sh = new Inheritencedemo();
        sh.circle();
        sh.Square();

    }
}
