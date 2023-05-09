
import MyUtils.Utils;
import java.util.ArrayList;
import java.util.Iterator;

public class Liststudent {

    private ArrayList<Student> list = new ArrayList();
    int n = 0;

    public ArrayList<Student> getList() {
        return list;
    }

    public void setList(ArrayList<Student> list) {
        this.list = list;
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

    public void inputStudent() {
        String code;
        String name;
        float mark;
        boolean check = true;
        do {
            code = Utils.getStringForm("Enter code: ", "Code is not empty !", "^S\\d{3}$", "Code is wrong format !");
            if (checkCode(code) >= 0) {
                System.out.println("Code is exist");
            } else {
                check = false;
            }
        } while (check);
        name = Utils.getString("Enter name: ", "Not empty !!");
        mark = Utils.getFloat("Enter mark: ", 0, 10);
        list.add(new Student(code, name, mark));
        System.out.println("!!!Added successfully!!!");
    }

    public void printAll() {
        for (Student x : list) {
            System.out.println("===Student list===");
            x.Viewinfo();
        }
    }

    public void removebycode() {

        String code;
        code = Utils.getStringForm("Enter code: ", "Code is not empty !", "^S\\d{3}$", "Code is wrong format !");

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCode().equalsIgnoreCase(code)) {
                list.remove(i);
                System.out.println("Code is removed !!");
            } else {
                System.out.println("Not found !!");
            }

        }
    }

    public void updatebycode() {
        String code;
        code = Utils.getStringForm("Enter code: ", "Code is not empty !", "^S\\d{3}$", "Code is wrong format !");
        int pos = checkCode(code);
        String p = Utils.getString("Enter name update: ", "Not empty !!");
        float m = Utils.getFloat("Enter mark update:", 0, 10);
        if (pos >= 0) {
            for (int i = 0; i < list.size(); i++) {
                if (code.equalsIgnoreCase(list.get(i).getCode())) {
                    list.get(i).setName(p);
                    list.get(i).setMark(m);
                    System.out.println("===Student list after===");
                    list.get(i).Viewinfo();
                } else {
                    System.out.println("Not found !!");
                }
            }
        }
    }

    public void searchbycode() {
        String code;
        code = Utils.getStringForm("Enter code: ", "Code is not empty !", "^S\\d{3}$", "Code is wrong format !");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCode().equalsIgnoreCase(code)) {
                System.out.println("===Student list===");
                list.get(i).Viewinfo();
            } else {
                System.out.println("Not found !!");
            }
        }
    }
}
