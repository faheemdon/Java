public class overloading {

    int x,y,z;

    double d;

    void sum()
    {
        System.out.println("this is method 1");
    }
    void sum(int a, int b)
    {
        System.out.println("this is method 2");
    }
    void sum(int a, double b)
    {
        System.out.println("this is method 3");

    }

    void sum(double a, int b)
    {
        System.out.println("this is Method 4");
    }

    public static void main(String[] args) {
        overloading ol = new overloading();
        ol.sum();
       ol.sum('a', 20);
        ol.sum(20,10.2);
        ol.sum(10.5, 40);

    }
}
