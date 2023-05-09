
import java.util.Scanner;


public class Part2 {
    public static void main(String[] args) {
        float a, b;
        String op;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number 1: ");
        a= sc.nextFloat();
        System.out.print("Enter number 2: ");
        b= sc.nextFloat();
        System.out.print("Enter operate: ");
        sc= new Scanner(System.in);
        op= sc.nextLine();
        if (op.equals("+")) {
            System.out.println("The result of "+a+ op +b+"= "+(a+b));
        }
        if (op.equals("-")) {
            System.out.println("The result of "+a+ op +b+"= "+(a-b));
        }
        if (op.equals("*")) {
            System.out.println("The result of "+a+ op +b+"= "+(a*b));
        }
        if (op.equals("/")) {
            System.out.println("The result of "+a+ op +b+"= "+(a/b));
        }
    }
}
    

