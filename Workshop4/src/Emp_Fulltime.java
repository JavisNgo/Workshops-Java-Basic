/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Emp_Fulltime extends Employees{
    int salary;
    int absent;

    public Emp_Fulltime(int salary, int absent, String code, String name, String address, String department, String phone) {
        super(code, name, address, department, phone);
        this.salary = salary;
        this.absent = absent;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAbsent() {
        return absent;
    }

    public void setAbsent(int absent) {
        this.absent = absent;
    }
    
    public int totalsalary() {
        return salary-absent*35;
    } 

    public void printinfo() {
        System.out.println(code+"\n"+name+"\n"+totalsalary());
    }
}
