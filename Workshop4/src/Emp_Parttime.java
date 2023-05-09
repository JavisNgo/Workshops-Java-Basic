
public class Emp_Parttime extends Employees{
    int dailywage;
    int present;

    public Emp_Parttime(int dailywage, int present, String code, String name, String address, String department, String phone) {
        super(code, name, address, department, phone);
        this.dailywage = dailywage;
        this.present = present;
    }

    public float getDailywage() {
        return dailywage;
    }

    public void setDailywage(int dailywage) {
        this.dailywage = dailywage;
    }

    public int getPresent() {
        return present;
    }

    public void setPresent(int present) {
        this.present = present;
    }
    
    public int totalsalary() {
        return dailywage*present;
    }
    
    public void printinfo() {
        System.out.println(code+"\n"+name+"\n"+totalsalary());
    }
    
}
