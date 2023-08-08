public class keyword {

    int x,y;

    void setdata(int x, int y)
    {
        this.x=x;
        this.y=y;
    }

    void display(){

        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
        keyword ky = new keyword();
        ky.setdata(10,20);
        ky.display();
    }
}

