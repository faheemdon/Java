import java.util.ArrayList;
import java.util.List;


public class Arraylistdemo  {
    public static void main(String[] args) {
        //declaration
        ArrayList mylist = new ArrayList();

        List mylist1 = new ArrayList();

        mylist.add(100);
        mylist.add(10.4);
        mylist.add(123.83f);
        mylist.add('a');
        mylist.add("faheem");
        mylist.add(true);
        mylist.add(null);

        //size of arraylist

        System.out.println(mylist.size());

        //print the elements
        System.out.println(mylist);
        //remove the value

        mylist.remove(6);
        System.out.println("after removing"+mylist);

        //insert new values

        mylist.add(5,"Don");
        System.out.println("after adding"+mylist);

        //capture single value

        System.out.println(mylist.get(4));
        //read all the mylist

       //Clear data

        mylist.clear();
        System.out.println("after clear"+mylist);




    }
}
