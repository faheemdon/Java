public class accoutdetails {

    int acc_no;
    String name;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    double salary;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }

    public static void main(String[] args) {

        accoutdetails ad = new accoutdetails();
        ad.setAcc_no(1025368);
        ad.setName("faheem");
        ad.setSalary(30000);
        System.out.println(ad.getAcc_no());
        System.out.println(ad.getName());
        System.out.println(ad.getSalary());

    }

}
