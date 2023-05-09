
public class DemoEmp {
    public static void main(String[] args) {
        ListEmployee objlist= new ListEmployee();
        
        int choice=0;
        do {
            System.out.println("\n=========Main menu=========\n");
            System.out.println("1. Create a Fulltime Employee");
            System.out.println("2. Create a Parttime Employee");
            System.out.println("3. Print a list of full-time employees");
            System.out.println("4. Print a list of part-time employees");
            System.out.println("5. Exit");
            choice=Utils.getInt("Enter choice: ", 0);
            switch (choice) {
                case 1:
                    objlist.inputFulltime();
                    break;
                case 2:
                    objlist.inputParttime();
                    break;
                case 3:
                    objlist.printinfoFulltime();
                    break;
                case 4:
                    objlist.printinfoParttime();
                    break;
                case 5:
                    System.out.println("Thank you");
                    System.exit(0);
            }
        } while (choice<=5);
    }
}
