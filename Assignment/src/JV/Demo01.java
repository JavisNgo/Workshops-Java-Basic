package JV;

import Utils.MyUtils;
import java.util.Scanner;

public class Demo01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        boolean check;
        ListProduct obj = new ListProduct();
        do {
            System.out.println("1. Add a new product. ");
            System.out.println("2. Print out the list of products on the screen");
            System.out.println("3. Print a list of Smartphones in descending order of price.");
            System.out.println("4. Print a list of Tivis in Ascending order of price.");
            System.out.println("5. Print a list of of	Air-conditioner  in descending order of price.");
            System.out.println("6. Print information about products with the highest prices.");
            System.out.println("7. Update the product information based on the code the user entered.");
            System.out.println("8. Delete an product based on the code the user entered.");
            System.out.println("9. Print the total amount of all products");
            System.out.println("10. Exit the program.");
            choice = MyUtils.getInt("Enter choice", 0);
            switch (choice) {
                case 1:
                    System.out.println("1.Smartphone || 2.Tivi || 3.Air-conditioner");
                    choice = (int) MyUtils.getInt("Enter choice", 0);
                    if (choice == 1) {
                        obj.inputSmartphone();
                        break;
                    } else if (choice == 2) {
                        obj.inputTV();
                        break;
                    } else if (choice == 3) {
                        obj.inputAirconditioner();
                        break;
                    } else {
                        System.out.println("Enter smaller !!");
                        break;
                    }
                case 2:
                    obj.printAll();
                    break;
                case 3:
                    obj.SMdescendprice();
                    break;
                case 4:
                    obj.Tiviascendprice();
                    break;
                case 5:
                    obj.ACdescendprice();
                    break;
                case 6:
                    obj.highestprice();
                    break;
                case 7:
                    obj.updatebycode();
                    break;
                case 8:
                    obj.removebycode();
                    break;
                case 9:
                    obj.TAAProduct();
                    break;
                default:
                    System.out.println("Thanks !!!");
            }
        } while (choice < 10);
    }
}
