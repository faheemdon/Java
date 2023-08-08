public class staticexample {

    static int a = 10;

    int b = 20;

    static void m1()
    {
        System.out.println("this is method 1");

    }

    void m2()
    {
        System.out.println("this is method 2");

    }

    public static void main(String[] args) {
        System.out.println(a);
        m1();

        staticexample se = new staticexample();
        System.out.println(se.b);
        se.m2();

    }


}
