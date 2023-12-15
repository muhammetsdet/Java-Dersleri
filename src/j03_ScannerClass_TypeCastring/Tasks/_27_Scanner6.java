package j03_ScannerClass_TypeCastring.Tasks;

import java.util.Scanner;

public class _27_Scanner6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("When is your birthday");
        String myBirthday = input.next();
        System.out.println("My birtday is : " + myBirthday);
    }
}
