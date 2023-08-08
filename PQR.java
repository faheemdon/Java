import java.sql.SQLOutput;

public class PQR extends MNO implements ABC, XYZ{


    public void m()
    {
        System.out.println("this is m1 from ABC");
        System.out.println(x);
    }


    public void m1()
    {
        System.out.println("this is m2 from XYZ");
        System.out.println(y);
    }

    public static void main(String[] args) {
        PQR obj = new PQR();

        obj.m();
        obj.m1();
        obj.m3();
    }
}
