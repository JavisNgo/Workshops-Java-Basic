
import java.util.Scanner;


public class Part3 {
    public static void main(String[] args) {
//        String[] list= new String[10];
//        Scanner sc= new Scanner(System.in);
//        String str;
//        for (int i=0; i<10; i++) {
//           System.out.println("Enter the list of name: ");
//           str=sc.nextLine();
//           char[] charArray=str.toCharArray();
//           for (int j=0; j<charArray.length;j++){
//              if (Character.isLetter(charArray[j])) {
//                charArray[j]= Character.toUpperCase(charArray[j]);
//             }
//          }
//        str= String.valueOf(charArray);
//        System.out.println("---UPPERCASE---");
//        System.out.println(str);
//        }
    int x = 0;
    int y = 0;
    
    for(int i = 0;i<4;i++){
        System.out.println(x);
        x++;
        System.out.println(x);
    }
        System.out.println("--------------------");
    for(int j = 0;j<4;j++){
        System.out.println(y);
        ++y;
        System.out.println(y);
    }
    
    }
}

