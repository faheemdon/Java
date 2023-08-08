public class studenttwo {

    int sid;
    String sname;
    int grade;
    void show()
    {
        System.out.println(sid+" "+sname+" "+grade);

    }

    void setdata(int id, String name, char g)
    {
        sid = id;
        sname = name;
        grade = g;

    }

    studenttwo(int id, String name, char g)
    {
        sid = id;
        sname = name;
        grade = g;
    }
}
