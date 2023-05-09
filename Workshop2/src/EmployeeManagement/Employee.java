package EmployeeManagement;

public class Employee {
    private String code, fullname, department;
    private int phone;
    private long salary, salarycoefficient;

    public Employee() {
    }

    public Employee(String code, String fullname, String department, int phone, long salary, long salarycoefficient) {
        this.code = code;
        this.fullname = fullname;
        this.department = department;
        this.phone = phone;
        this.salary = salary;
        this.salarycoefficient = salarycoefficient;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public long getSalarycoefficient() {
        return salarycoefficient;
    }

    public void setSalarycoefficient(long salarycoefficient) {
        this.salarycoefficient = salarycoefficient;
    }
    
    public void viewinfor() {
        System.out.println(code+" - "+fullname+" - "+phone+" - "+salary+" - "+salarycoefficient+" - "+department);
    }
    
    public void totalsalary() {
        System.out.println(salary*salarycoefficient);
        System.out.println("--------------");
    }

}
