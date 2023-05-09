
package EmployeeManagement;

import java.util.Scanner;


public class Demo {
    public static Employee[] InputEmployee() {
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("Enter number of employee: ");
        n= Integer.parseInt(sc.nextLine());
        Employee [] list= new Employee[n];
        String code, fullname, department;
        int phone;
        long salary, salarycoefficient;
        for (int i=0;i<n;i++) {
            System.out.println("Enter code: ");
            code= sc.nextLine();
            System.out.println("Enter full name: ");
            fullname=sc.nextLine();
            System.out.println("Enter phone: ");
            phone= Integer.parseInt(sc.nextLine());
            System.out.println("Enter salary: ");
            salary= Long.parseLong(sc.nextLine());
            System.out.println("Enter salary coefficient: ");
            salarycoefficient= Long.parseLong(sc.nextLine());
            System.out.println("Enter department: ");
            department= sc.nextLine();
            Employee em= new Employee(code, fullname, department, phone, salary, salarycoefficient);
            list[i]= em;
            System.out.println("\n--------------");
        }
        return list;
    }
    
    public void print(Employee [] list) {
        for (Employee x: list) {
            x.viewinfor();
        }
    }
    
     public void total(Employee [] list) {
        for (Employee x: list){
            x.totalsalary();
        }
    }

     public boolean update(Employee [] list) {
        Scanner sc= new Scanner(System.in);
        boolean check=false;
        String code;
        long salary;
        System.out.println("Enter code: ");
        code= sc.nextLine();
        for (Employee x: list) {
                 if (x.getCode().equalsIgnoreCase(code)) {
                    System.out.println("Enter salary: ");
                    salary= Long.parseLong(sc.nextLine());
                    x.setSalary(salary);
                    x.viewinfor();
                    check=true;
                 }
         }
        return check;
     }
     
     public boolean remove(Employee [] list) {
        Scanner sc= new Scanner(System.in);
        boolean check=false;
        int temp = 0;
        int lenght = list.length - 1;
        String code;
        System.out.println("Enter code: ");
        code = sc.nextLine();
        Employee[] temparray = new Employee[lenght];
        for (int i = 0; i < list.length; i++) {
            if (list[i].getCode().equalsIgnoreCase(code) == true) {
                temp = i;
            }
        }
        for (int i = 0, j = 0; i < list.length; i++) {
            if (i != temp) {
                temparray[j] = list[i];
                j++;
            }
        }
        list = new Employee[lenght];
        for (int i = 0, j = 0; i < list.length; i++) {
            list[i] = temparray[i];
        }
        for (Employee x : list) {
            x.viewinfor();
            check=true;
        }
        return check;
}        
     
     
    public static void main(String[] args) {
        Demo obj= new Demo();
        boolean result= false;
        Employee [] list= obj.InputEmployee();
        System.out.println("Information of employee: ");
        obj.print(list);
        System.out.println("Total salary: ");
        obj.total(list);
        System.out.println("Update salary \n--------");
        result=obj.update(list);
        System.out.println(result?"Update sucessful":"Update fail");
        System.out.println("Remove employee ");
        result=obj.remove(list);
        System.out.println(result?"Remove sucessful":"Remove fail");
    }
}
