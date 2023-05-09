
package MyUtils;

import java.util.Scanner;

public class Utils {
    public static String getString(String welcome, String msg) {
        boolean check = true;
        String result = "";
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(welcome);
            result = sc.nextLine();
            if (result.isEmpty()) {
                System.out.println(msg);
            } else {
                check = false;
            }
        } while (check);
        return result;
    }

    public static String getStringForm(String welcome, String msg, String pattern, String form) {
        boolean check = true;
        String result = "";
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(welcome);
            result = sc.nextLine();
            if (result.isEmpty()) {
                System.out.println(msg);
            } else if (!result.matches(pattern)) {
                System.out.println(form);
            } else {
                check = false;
            }
        } while (check);
        return result;
    }

    public static long getLong(String welcome, int min) {
        boolean check = true;
        long number = 0;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.println(welcome);
                number = Long.parseLong(sc.nextLine());
                if (number < min) {
                    System.out.println("Must be larger than " + min);
                } else {
                    check = false;
                }
            }
            catch(Exception e) {
            System.out.println("Input number !!!");
            }
        } while (check);
        return number;
    }
    
    public static float getFloat(String welcome, int min, int max) {
        boolean check = true;
        float number = 0;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.println(welcome);
                number = Integer.parseInt(sc.nextLine());
                if (number < min) {
                    System.out.println("Must be larger than " + min);
                } else if (number >max) {
                    System.out.println("Must be smaller than " + max);
                }
                else {
                    check = false;
                }
            }
            catch(Exception e) {
            System.out.println("Input number !!!");
            }
        } while (check);
        return number;
    }
    
    public static int getInt(String welcome, int min) {
        boolean check = true;
        int number = 0;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.println(welcome);
                number = Integer.parseInt(sc.nextLine());
                if (number < min) {
                    System.out.println("Must be larger than " + min);
                } else {
                    check = false;
                }
            }
            catch(Exception e) {
            System.out.println("Input number !!!");
            }
        } while (check);
        return number;
    }
}
