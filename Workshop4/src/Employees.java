
public abstract class Employees {
    String code, name, address, department;
    String phone;

    public Employees(String code, String name, String address, String department, String phone) {
        this.code = code;
        this.name = name;
        this.address = address;
        this.department = department;
        this.phone = phone;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
      
    public abstract int totalsalary();
    
    public abstract void printinfo();
    
}
