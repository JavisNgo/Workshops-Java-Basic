package JV;

import MY.Airconditioner;
import MY.Product;
import MY.Smartphone;
import MY.TV;
import Utils.MyUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ListProduct {

    private ArrayList<Product> list = new ArrayList();
    int n = 0;

    public ArrayList<Product> getList() {
        return list;
    }

    public void setList(ArrayList<Product> list) {
        this.list = list;
    }

    public void inputSmartphone() {
        String code;
        String name;
        String brand;
        String RAM;
        String CPU;
        String size;
        int price;
        int quantity;
        boolean check = true;
        do {
            code = MyUtils.getStringForm("Enter code: ", "Code is not empty !", "^SM\\d{3}$", "Code is wrong format !");
            if (checkCode(code) >= 0) {
                System.out.println("Code is exist");
            } else {
                check = false;
            }
        } while (check);
        name = MyUtils.getString("Enter name: ", "Not empty !!");
        brand = MyUtils.getString("Enter brand: ", "Not empty !!");
        size = MyUtils.getString("Enter size: ", "Not empty!!");
        price = MyUtils.getInt("Enter price: ", 0);
        quantity = MyUtils.getInt("Enter quantity: ", 0);
        RAM = MyUtils.getString("Enter RAM: ", "Not empty !!");
        CPU = MyUtils.getString("Enter CPU: ", "Not empty !!");
        list.add(new Smartphone(code, name, brand, size, price, quantity, RAM, CPU));
        System.out.println("!! Added Successfull !!");
    }

    public void inputTV() {
        String code;
        String name;
        String brand;
        String size;
        int price;
        int quantity;
        boolean check = true;
        do {
            code = MyUtils.getStringForm("Enter code: ", "Code is not empty !", "^TI\\d{3}$", "Code is wrong format !");
            if (checkCode(code) >= 0) {
                System.out.println("Code is exist");
            } else {
                check = false;
            }
        } while (check);
        name = MyUtils.getString("Enter name: ", "Not empty !!");
        brand = MyUtils.getString("Enter brand: ", "Not empty !!");
        size = MyUtils.getString("Enter size: ", "Not empty!!");
        price = MyUtils.getInt("Enter price: ", 0);
        quantity = MyUtils.getInt("Enter quantity: ", 0);
        list.add(new TV(code, name, brand, size, price, quantity));
        System.out.println("!! Added Successfull !!");
    }

    public void inputAirconditioner() {
        String code;
        String name;
        String brand;
        String size;
        int price;
        int quantity;
        boolean check = true;
        do {
            code = MyUtils.getStringForm("Enter code: ", "Code is not empty !", "^AIR\\d{3}$", "Code is wrong format !");
            if (checkCode(code) >= 0) {
                System.out.println("Code is exist");
            } else {
                check = false;
            }
        } while (check);
        name = MyUtils.getString("Enter name: ", "Not empty !!");
        brand = MyUtils.getString("Enter brand: ", "Not empty !!");
        size = MyUtils.getString("Enter size: ", "Not empty!!");
        price = MyUtils.getInt("Enter price: ", 0);
        quantity = MyUtils.getInt("Enter quantity: ", 0);
        list.add(new Airconditioner(code, name, brand, size, price, quantity));
        System.out.println("!! Added Successfull !!");
    }

    public void printAll() {
        System.out.println("***Here is the list Products***");
        System.out.println("Code | Name | Brand | Size | Price | Quantity | RAM | CPU");
        System.out.println("=========================================================");
        for (Product x : list) {
            x.ViewInfor();
        }
    }

    public int checkCode(String code) {
        boolean check = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCode().equals(code)) {
                return i;
            }
        }
        return -1;
    }

    public void removebycode() {
        if (list.isEmpty()) {
            System.out.println("The list is empty. Please type ! ");
        } else {
            String code;
            code = MyUtils.getStringForm("Enter code: ", "Code is not empty !", "^(SM||TI||AIR)\\d{3}$", "Code is wrong format !");
            for (int i = 0; i < list.size(); i++) {
                if (code.equalsIgnoreCase(list.get(i).getCode())) {
                    list.remove(i);
                    System.out.println("Code is removed !!");
                    break;
                } else {
                    System.out.println("Not found !!");
                    break;
                }
            }
        }
    }

    public void updatebycode() {
        String code = MyUtils.getStringForm("Enter code: ", "Code is not empty !", "^(SM||TI||AIR)\\d{3}$", "Code is wrong format !");
        int pos = checkCode(code);
        if (pos >= 0) {
            if (list.get(pos) instanceof Smartphone) {
                updateSM(pos);
            } else if (list.get(pos) instanceof TV) {
                updateGerne(pos);
            } else if (list.get(pos) instanceof Airconditioner) {
                updateGerne(pos);
            } else {
                System.out.println("Not found");
            }
        }
    }

    public void updateGerne(int pos) {
        System.out.println("===Updatae list===");
        list.get(pos).setName(MyUtils.getString("Enter name: ", "Not empty !!"));
        list.get(pos).setBrand(MyUtils.getString("Enter brand: ", "Not empty !!"));
        list.get(pos).setSize(MyUtils.getString("Enter size: ", "Not empty!!"));
        list.get(pos).setPrice(MyUtils.getInt("Enter price: ", 0));
        list.get(pos).setQuantity(MyUtils.getInt("Enter quantity: ", 0));
        System.out.println("Update successful");
    }

    public void updateSM(int pos) {
        System.out.println("===Updatae list===");
        list.get(pos).setName(MyUtils.getString("Enter name: ", "Not empty !!"));
        list.get(pos).setBrand(MyUtils.getString("Enter brand: ", "Not empty !!"));
        list.get(pos).setSize(MyUtils.getString("Enter size: ", "Not empty!!"));
        list.get(pos).setPrice(MyUtils.getInt("Enter price: ", 0));
        list.get(pos).setQuantity(MyUtils.getInt("Enter quantity: ", 0));
        for (Product x : list) {
            ((Smartphone) x).setRAM(MyUtils.getString("Enter RAM: ", "Not empty !!"));
            ((Smartphone) x).setCPU(MyUtils.getString("Enter CPU: ", "Not empty !!"));
            break;
        }
        System.out.println("Update successful");
    }

    public void SMdescendprice() {
        if (list.isEmpty()) {
            System.out.println("The list is empty. Please type ! ");
        } else {
            Comparator comparatorSM = new Comparator<Product>() {
                @Override
                public int compare(Product s, Product s1) {
                    if (s.getPrice() > s1.getPrice()) {
                        return -1;
                    } else if (s.getPrice() == s1.getPrice()) {
                        return s1.getCode().compareToIgnoreCase(s.getCode());
                    } else {
                        return 1;
                    }
                }
            };
            Collections.sort(list, comparatorSM);
            System.out.println("***Here is the list Smartphone***");
            System.out.println("Code | Name | Brand | Size | Price | Quantity | RAM | CPU");
            System.out.println("=========================================================");
            for (Product x : list) {
                if (x instanceof Smartphone) {
                    x.ViewInfor();
                }
            }
        }
    }

    public void ACdescendprice() {
        if (list.isEmpty()) {
            System.out.println("The list is empty. Please type ! ");
        } else {
            Comparator comparatorAC = new Comparator<Product>() {
                @Override
                public int compare(Product a, Product a1) {
                    if (a.getPrice() > a1.getPrice()) {
                        return -1;
                    } else if (a.getPrice() == a1.getPrice()) {
                        return a1.getCode().compareToIgnoreCase(a.getCode());
                    } else {
                        return 1;
                    }
                }
            };
            Collections.sort(list, comparatorAC);
            System.out.println("***Here is the list Airconditioner***");
            System.out.println("Code | Name | Brand | Size | Price | Quantity");
            System.out.println("=========================================================");
            for (Product x : list) {
                if (x instanceof Airconditioner) {
                    x.ViewInfor();

                }
            }
        }
    }

    public void Tiviascendprice() {
        if (list.isEmpty()) {
            System.out.println("The list is empty. Please type ! ");
        } else {
            Comparator comparatorTV = new Comparator<Product>() {
                @Override
                public int compare(Product t, Product t1) {
                    if (t.getPrice() > t1.getPrice()) {
                        return 1;
                    } else if (t.getPrice() == t1.getPrice()) {
                        return t1.getCode().compareToIgnoreCase(t.getCode());
                    } else {
                        return -1;
                    }
                }
            };
            Collections.sort(list, comparatorTV);
            System.out.println("***Here is the list Tivi***");
            System.out.println("Code | Name | Brand | Size | Price | Quantity");
            System.out.println("=========================================================");
            for (Product x : list) {
                x.ViewInfor();
                //break;
            }
        }
    }

    public void highestprice() {
        if (list.isEmpty()) {
            System.out.println("The list is empty. Please type ! ");
        } else {
            int max = 0;
            int pos = 0;
            for (int i = 0; i < list.size(); i++) {
                if (max < list.get(i).getPrice()) {
                    max = list.get(i).getPrice();
                    pos = i;
                }
            }
            System.out.println("***Here are products with the highest prices***");
            System.out.println("Code | Name | Brand | Size | Price | Quantity | RAM | CPU");
            System.out.println("=========================================================");
            for (Product x : list) {
                if (x.getPrice() == max) {
                    x.ViewInfor();
                }
            }
        }
    }

    public void TAAProduct() {
        if (list.isEmpty()) {
            System.out.println("The list is empty. Please type ! ");
        } else {
            int sum = 0;
            for (Product x : list) {
                x.ViewInfor();
                sum += x.Totalamount();
            }
            System.out.println("Total of all products: " + sum + "VND");
        }
    }
}
