public class Asssingmentoverload
{
    public static void main(String[] args) {

        Asssingmentoverload ao = new Asssingmentoverload();
        System.out.println("this is entry point");
        ao.main(10);

    }
    void main(int a)
{
    System.out.println("this is method 1");
}

void main(int b, double d)
{
    System.out.println("this is method 2");
}

}


