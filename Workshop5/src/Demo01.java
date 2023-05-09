
import MyUtils.Utils;
import java.util.Scanner;


public class Demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        boolean check;
        Liststudent obj = new Liststudent();
        do {
            System.out.println("***MENU***");
            System.out.println("1. Add new student");
            System.out.println("2. Search a student based on his/her code.");
            System.out.println("3. Update name and mark of a student based on his/her code");
            System.out.println("4. Remove a student based on his/her code");
            System.out.println("5. List all students.");
            System.out.println("6. Exit");
            choice = Utils.getInt("Enter choice", 0);
            switch(choice) {
                case 1: 
                    obj.inputStudent();
                    break;
                case 2:
                    obj.searchbycode();
                    break;
                case 3:
                    obj.updatebycode();
                    break;
                case 4: 
                    obj.removebycode();
                    break;
                case 5:
                    obj.printAll();
                    break;
                default: 
                    System.out.println("Thanks !!!");
            }
        } while (choice<6);
    }
}
