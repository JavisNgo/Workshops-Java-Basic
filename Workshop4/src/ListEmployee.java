
public class ListEmployee {

    Employees[] list= new Employees[100];
    int n=0;
    
    public void inputFulltime() {
        String code;
        String name;
        String phone;
        String address;
        String department;
        int salary;
        int absent;
        do
        {code= Utils.getStringreg("Enter Code:", "^FS\\d{5}$", "Code is not null", "Code is wrong format");}
        while (checkCode(code));
        
        name= Utils.getString("Enter Name: ", "Name is not null");
        phone= Utils.getStringreg("Enter phone: ", "^0\\d{9,11}$", "Phone is not null", "Number phone must be 10 or 12");
        address= Utils.getString("Enter address: ", "Address is not null");
        department= Utils.getString("Enter department: ", "Department is not null");
        salary= Utils.getInt("Enter salary: ", 1500);
        absent= Utils.getInt("Enter absent", 0);
        list[n++]= new Emp_Fulltime(salary, absent, code, name, address, department, phone);
        System.out.println("Added successfully");
    }
    
    public void inputParttime() {
        String code;
        String name;
        String phone;
        String address;
        String department;
        int dailywage;
        int present;
        do
        {code= Utils.getStringreg("Enter Code: ", "^FS\\d{5}$", "Code is not null", "Code is wrong format");}
        while(checkCode(code));
        
        name= Utils.getString("Enter Name: ", "Name is not null");
        phone= Utils.getStringreg("Enter phone: ", "^0\\d{9,11}$", "Phone is not null", "Number phone must be 10 or 12");
        address= Utils.getString("Enter address: ", "Address is not null");
        department= Utils.getString("Enter department: ", "Department is not null");
        dailywage= Utils.getInt("Enter daily wage: ", 10);
        present= Utils.getInt("Enter present: ", 0);
        list[n++]= new Emp_Parttime(dailywage, present, code, name, address, department, phone);
        System.out.println("Added successfully");
    }
    
    public void printinfoFulltime() {
        for(Employees x: list) {
            if (x instanceof Emp_Fulltime)
                x.printinfo();
        }
    }
    
    public void printinfoParttime() {
        for(Employees x: list) {
            if (x instanceof Emp_Parttime)
                x.printinfo();
        }
    }
    
    public boolean checkCode(String code) {
        boolean check=false;
        for (int i=0; i<n;i++) {
            if (list[i].getCode().equalsIgnoreCase(code)) {
                System.out.println("This code is existed !");
                check=true;
            }
        }
        return check;
    }
}
