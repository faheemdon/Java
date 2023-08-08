public class student {

    int sroll;
    String sname;
    char grade;
    int sper;

    void display()
    {
        System.out.println(sroll);
        System.out.println(sname);
        System.out.println(grade);
        System.out.println(sper);
    }

    public static void main(String[] args) {
        student st = new student();

        st.display();
    }


    }

