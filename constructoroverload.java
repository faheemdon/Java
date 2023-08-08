public class constructoroverload {

    constructoroverload()
    {
        System.out.println("this is constructor 1");
    }
    constructoroverload(int a, int b)
    {
        System.out.println("this is constructor 2");

    }
    constructoroverload(int a ,double b)
    {
        System.out.println("this is constructor 3");
    }

    constructoroverload(double a, int b)
    {
        System.out.println("this is constructor 4");
    }

    constructoroverload(String a , char b)
    {
        System.out.println("this is constructor 5");
    }

    constructoroverload(char a, float b)
    {
        System.out.println("this is constructor 6");
    }


    public static void main(String[] args) {
        constructoroverload co = new constructoroverload(100, 200);
        constructoroverload co1 = new constructoroverload(102,10.7);
        constructoroverload co3 = new constructoroverload(10.8, 105);
        constructoroverload co4 = new constructoroverload("faheem",'A');
        constructoroverload co5 = new constructoroverload('B',20.8f);



    }
}






